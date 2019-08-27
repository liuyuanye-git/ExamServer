package com.example.ExamServer.model;

import java.io.Serializable;

public class PaperQuestion implements Serializable {
    private Integer paperCode;

    private Integer questionId;

    private Double score;

    private String answer;

    private static final long serialVersionUID = 1L;

    public Integer getPaperCode() {
        return paperCode;
    }

    public void setPaperCode(Integer paperCode) {
        this.paperCode = paperCode;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paperCode=").append(paperCode);
        sb.append(", questionId=").append(questionId);
        sb.append(", score=").append(score);
        sb.append(", answer=").append(answer);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}