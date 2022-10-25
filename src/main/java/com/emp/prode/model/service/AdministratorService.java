package com.emp.prode.model.service;

import com.emp.prode.model.DAO.Exam.ExamToGradeDao;
import com.emp.prode.model.DAO.Exam.GradedExamDao;
import com.emp.prode.model.DAO.Exam.SpecificExamDaoInterface;

import java.util.ArrayList;

public class AdministratorService implements SpecificUserService
{
    @Override
    public ArrayList<SpecificExamDaoInterface> getAllExamsDAOs()
    {
        ArrayList<SpecificExamDaoInterface> examDAOs = new ArrayList<>();
        examDAOs.add(new ExamToGradeDao());
        examDAOs.add(new GradedExamDao());
        return examDAOs;
    }
}
