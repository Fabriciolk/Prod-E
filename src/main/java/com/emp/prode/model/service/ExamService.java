package com.emp.prode.model.service;

import com.emp.prode.model.DAO.Exam.ExamDao;
import com.emp.prode.model.DAO.Exam.SpecificExamDaoInterface;
import com.emp.prode.model.DTO.ClassDTO;
import com.emp.prode.model.DTO.ExamDTO;
import com.emp.prode.model.DTO.QuestionDTO;
import com.emp.prode.model.entity.exam.Exam;
import com.emp.prode.model.entity.exam.SpecificExamInterface;
import com.emp.prode.model.entity.user.UserType;

import java.util.ArrayList;

public class ExamService
{
    ExamDao examDao = new ExamDao();

    public void fillClassWithExams(ClassDTO classDTO, UserType userType, String studentLogin)
    {
        classDTO.exams = new ArrayList<>();
        ArrayList<Exam> exams = examDao.findAllByClassID(classDTO.classID);
        SpecificUserService specificUserService = UserTypeMapper.getUserServiceByUser(userType);

        assert specificUserService != null;
        for (Exam exam : exams)
        {
            for (SpecificExamDaoInterface specificExamDao : specificUserService.getAllExamsDAOs())
            {
                for (SpecificExamInterface specificExam : specificExamDao.findAllByExamID(exam.getID()))
                {
                    Exam parentExam = specificExamDao.findParentExamByID(specificExam.getID());
                    ExamDTO examDTO = new ExamDTO(
                            parentExam.getID(),
                            parentExam.getName(),
                            parentExam.getTimeToDeliverInSeconds(),
                            parentExam.getClosedQuestionsAmount(),
                            parentExam.getOpenQuestionsAmount(),
                            specificExam.getSpecificExamDTO(),
                            null
                    );

                    classDTO.exams.add(examDTO);
                    fillExamWithQuestions(examDTO, studentLogin);
                }
            }
        }
    }

    private void fillExamWithQuestions(ExamDTO examDTO, String studentLogin)
    {
        new ExamQuestionMapService().fillExamWithQuestions(examDTO);

        QuestionService questionService = new QuestionService();
        AnswerService answerService = new AnswerService();

        for (QuestionDTO questionDTO : examDTO.questions)
        {
            questionService.fillQuestionWithAlternatives(questionDTO);
            answerService.fillQuestionWithAnswer(questionDTO, studentLogin);
        }
    }
}
