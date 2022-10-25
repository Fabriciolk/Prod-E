package com.emp.prode.model.service;

import com.emp.prode.model.DAO.Class.ClassDao;
import com.emp.prode.model.DAO.Class.ClassProfessorDao;
import com.emp.prode.model.DAO.Class.ClassStudentDao;
import com.emp.prode.model.entity.user.UserType;

public class UserTypeMapper
{
    public static SpecificUserService getUserServiceByUser(UserType userType)
    {
        if (userType == UserType.STUDENT)
        {
            return new StudentService();
        }
        else if (userType == UserType.PROFESSOR)
        {
            return new ProfessorService();
        }
        else if (userType == UserType.ADMINISTRATOR)
        {
            return new AdministratorService();
        }

        return null;
    }

    public static ClassDao getClassDaoByUserType(UserType userType)
    {
        if (userType == UserType.STUDENT)
        {
            return new ClassStudentDao();
        }
        else if (userType == UserType.PROFESSOR || userType == UserType.ADMINISTRATOR)
        {
            return new ClassProfessorDao();
        }

        return null;
    }
}
