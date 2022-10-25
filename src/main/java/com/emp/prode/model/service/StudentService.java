package com.emp.prode.model.service;

import com.emp.prode.model.DAO.Exam.ExamToTakeDao;
import com.emp.prode.model.DAO.Exam.GradedExamDao;
import com.emp.prode.model.DAO.Exam.SpecificExamDaoInterface;

import java.util.ArrayList;

public class StudentService implements SpecificUserService
{
    @Override
    public ArrayList<SpecificExamDaoInterface> getAllExamsDAOs()
    {
        ArrayList<SpecificExamDaoInterface> examDAOs = new ArrayList<>();
        examDAOs.add(new ExamToTakeDao());
        examDAOs.add(new GradedExamDao());
        return examDAOs;
    }
}
