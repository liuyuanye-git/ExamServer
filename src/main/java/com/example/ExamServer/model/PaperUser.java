package com.example.ExamServer.model;

import java.io.Serializable;

public class PaperUser implements Serializable {
    private Integer paperCode;

    private Integer userId;

    private Double keguanGrade;

    private Double zhuguanGrade;

    private static final long serialVersionUID = 1L;

    public Integer getPaperCode() {
        return paperCode;
    }

    public void setPaperCode(Integer paperCode) {
        this.paperCode = paperCode;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getKeguanGrade() {
        return keguanGrade;
    }

    public void setKeguanGrade(Double keguanGrade) {
        this.keguanGrade = keguanGrade;
    }

    public Double getZhuguanGrade() {
        return zhuguanGrade;
    }

    public void setZhuguanGrade(Double zhuguanGrade) {
        this.zhuguanGrade = zhuguanGrade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paperCode=").append(paperCode);
        sb.append(", userId=").append(userId);
        sb.append(", keguanGrade=").append(keguanGrade);
        sb.append(", zhuguanGrade=").append(zhuguanGrade);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}