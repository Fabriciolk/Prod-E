package com.emp.prode.model.service;

import com.emp.prode.model.DAO.question.QuestionAnswerDao;
import com.emp.prode.model.DTO.QuestionAnswerDTO;
import com.emp.prode.model.DTO.QuestionDTO;
import com.emp.prode.model.entity.question.QuestionAnswer;

public class AnswerService
{
    public void fillQuestionWithAnswer(QuestionDTO questionDTO, String studentLogin)
    {
        QuestionAnswer questionAnswer = new QuestionAnswerDao().find(studentLogin, questionDTO.questionID);
        if (questionAnswer != null)
        {
            questionDTO.answer = new QuestionAnswerDTO(
                    questionAnswer.getStudent().getStudentPK().getStudentLogin(),
                    questionAnswer.getAlternative(),
                    questionAnswer.getText(),
                    questionAnswer.getImage(),
                    questionAnswer.getScore(),
                    questionDTO.getQuestionID(),
                    questionAnswer.getComment(),
                    questionAnswer.getProfessor());
        }
    }
}
