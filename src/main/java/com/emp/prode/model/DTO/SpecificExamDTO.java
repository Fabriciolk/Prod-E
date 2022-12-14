package com.emp.prode.model.DTO;

import com.emp.prode.model.entity.exam.ExamType;

import java.sql.Timestamp;

public class SpecificExamDTO
{
    public ExamType examType;
    public float score;
    public int openQuestionsGraded;
    public Timestamp limitDateToTake;
    public Timestamp gradedTime;

    public SpecificExamDTO(ExamType examType,
                           float score,
                           int openQuestionsGraded,
                           Timestamp limitDateToTake,
                           Timestamp gradedTime)
    {
        this.examType = examType;
        this.score = score;
        this.openQuestionsGraded = openQuestionsGraded;
        this.limitDateToTake = limitDateToTake;
        this.gradedTime = gradedTime;
    }

    public ExamType getExamType() {
        return examType;
    }

    public float getScore() {
        return score;
    }

    public int getOpenQuestionsGraded() {
        return openQuestionsGraded;
    }

    public Timestamp getLimitDateToTake() {
        return limitDateToTake;
    }

    public Timestamp getGradedTime() {
        return gradedTime;
    }

    public String getPrintSpecificExamInfo(int numberOfTags)
    {
        String tagsSpace = "";
        for (int i = 0; i < numberOfTags; i++) tagsSpace = tagsSpace.concat("\t");

        return "\n" + tagsSpace + "examType=" + examType +
                ",\n" + tagsSpace + "score=" + score +
                ",\n" + tagsSpace + "openQuestionsGraded=" + openQuestionsGraded +
                ",\n" + tagsSpace + "limitDateToTake=" + limitDateToTake +
                ",\n" + tagsSpace + "gradedTime=" + gradedTime;
    }
}
