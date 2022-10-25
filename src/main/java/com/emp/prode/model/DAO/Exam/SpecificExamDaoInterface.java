package com.emp.prode.model.DAO.Exam;


import com.emp.prode.model.entity.exam.Exam;
import com.emp.prode.model.entity.exam.SpecificExamInterface;

import java.util.ArrayList;

public interface SpecificExamDaoInterface
{
    ArrayList<SpecificExamInterface> findAllByExamID(Long examID);

    Exam findParentExamByID(Long examID);
}
