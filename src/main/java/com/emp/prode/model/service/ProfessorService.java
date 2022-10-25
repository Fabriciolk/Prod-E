package com.emp.prode.model.service;

import com.emp.prode.model.DAO.Class.ClassProfessorDao;
import com.emp.prode.model.DAO.Exam.ExamToGradeDao;
import com.emp.prode.model.DAO.Exam.GradedExamDao;
import com.emp.prode.model.DAO.Exam.SpecificExamDaoInterface;
import com.emp.prode.model.entity.classroom.ClassProfessor;

import java.util.ArrayList;

public class ProfessorService implements SpecificUserService
{
    @Override
    public ArrayList<SpecificExamDaoInterface> getAllExamsDAOs()
    {
        ArrayList<SpecificExamDaoInterface> examDAOs = new ArrayList<>();
        examDAOs.add(new ExamToGradeDao());
        examDAOs.add(new GradedExamDao());
        return examDAOs;
    }

    public ArrayList<String> getAllProfessorsByClass(String classID)
    {
        ArrayList<ClassProfessor> classProfessors = new ClassProfessorDao().findAllByClass(classID);
        ArrayList<String> professorLogins = new ArrayList<>();

        for (ClassProfessor c : classProfessors) professorLogins.add(c.getProfessor().getName());

        return professorLogins;
    }
}
