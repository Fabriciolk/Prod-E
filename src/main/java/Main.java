import com.emp.prode.controller.LoginController;
import com.emp.prode.model.DAO.Class.ClassProfessorDao;
import com.emp.prode.model.DAO.Class.ClassStudentDao;
import com.emp.prode.model.DAO.Class.ClassSubjectDao;
import com.emp.prode.model.DAO.Exam.ExamDao;
import com.emp.prode.model.DAO.Exam.ExamToTakeDao;
import com.emp.prode.model.DAO.User.ProfessorDao;
import com.emp.prode.model.DAO.User.StudentDao;
import com.emp.prode.model.DAO.User.SystemUserDao;
import com.emp.prode.model.DAO.question.ExamQuestionMapDao;
import com.emp.prode.model.DAO.question.QuestionAlternativeDao;
import com.emp.prode.model.DAO.question.QuestionAnswerDao;
import com.emp.prode.model.DAO.question.QuestionDao;

import java.sql.Timestamp;

public class Main
    {
        public static void main(String[] args)
        {
            LoginController loginController = new LoginController();
    //        loginController.register("fabriciokashino@live.com", "pass123", null, "Fabricio");
    //        loginController.register("joao_pe_de_feijao@yahoo.com", "asda133", null, "João");
    //        loginController.register("maria.florentina@hotmail.com", "f09fu21", null, "Maria");
    //        loginController.register("acabou_jessica@gmail.com", "dfbt234", null, "Jessica");


    //        // Users
    //        new SystemUserDao().create("student1@hotmail.com", "123", null);
    //        new SystemUserDao().create("professor1@hotmail.com", "123", null);
    //
    //        new StudentDao().create("student1@hotmail.com", "student1");
    //        new ProfessorDao().create("professor1@hotmail.com", "professor1");
    //
    //        // Class
    //        new ClassSubjectDao().create("computerID", "computer");
    //
    //        new ClassStudentDao().create("computerID", "student1@hotmail.com");
//        new ClassProfessorDao().create("computerID", "professor1@hotmail.com");
//
//        // Exam
//        new ExamDao().create("computer-P1", 123123, 12, 2, "computerID");
//
//        new ExamToTakeDao().create(1L, Timestamp.valueOf("2022-01-30 23:59:59"));

//        // Question
//        new QuestionDao().create("Enunciado da questao 1", null, 20, "0", null, null);
//        new QuestionDao().create("Enunciado da questao 2", null, 10, "123",null, null);
//        new QuestionDao().create("Enunciado da questao 3", null, 15, "546asd", null, null);
//
//        new QuestionAlternativeDao().create(1L, 'a', "adasd", null);
//        new QuestionAlternativeDao().create(1L, 'b', "adasd", null);
//        new QuestionAlternativeDao().create(1L, 'c', "adasd", null);

//        new QuestionAnswerDao().create("student1@hotmail.com", 'a', null, null, 0, 1L, "sadasda", "professor1@hotmail.com");

        // Exam-Question Map
//        new ExamQuestionMapDao().create(1L, 1L);


//        System.out.println(loginController.login("student1@hotmail.com", "123"));
    }
}
