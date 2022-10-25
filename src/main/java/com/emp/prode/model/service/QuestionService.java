package com.emp.prode.model.service;

import com.emp.prode.model.DAO.question.QuestionAlternativeDao;
import com.emp.prode.model.DTO.*;
import com.emp.prode.model.entity.question.QuestionAlternative;

import java.util.ArrayList;

public class QuestionService
{
    public void fillQuestionWithAlternatives(QuestionDTO questionDTO)
    {
        questionDTO.alternatives = new ArrayList<>();

        for (QuestionAlternative alternative : new QuestionAlternativeDao().findAllByQuestion(questionDTO.questionID))
        {
            questionDTO.alternatives.add(new QuestionAlternativeDTO(
                    alternative.getQuestionAlternativePK().getAlternative(),
                    alternative.getText(),
                    alternative.getImage()));
        }
    }
}
