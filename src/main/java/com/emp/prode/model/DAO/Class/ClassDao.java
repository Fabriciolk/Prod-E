package com.emp.prode.model.DAO.Class;

import com.emp.prode.model.entity.classroom.ClassroomIndicator;

import java.util.ArrayList;

public interface ClassDao
{
    ArrayList<ClassroomIndicator> findAllByUser(String username);
}
