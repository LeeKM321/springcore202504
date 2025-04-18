package com.study.springcore.score.entity;

/*
CREATE TABLE scores (
	stu_num INT PRIMARY KEY AUTO_INCREMENT,
    stu_name VARCHAR(30) NOT NULL,
    kor INT NOT NULL DEFAULT 0,
    eng INT NOT NULL DEFAULT 0,
    math INT NOT NULL DEFAULT 0,
    total INT NOT NULL DEFAULT 0,
    average FLOAT,
    grade VARCHAR(1)
);

 */

import lombok.*;

// 데이터베이스 테이블과 1:1로 매칭되는 필드를 가진 객체: Entity
@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class Score {

    private int stuNum;
    private String stuName;
    private int kor;
    private int eng;
    private int math;
    private int total;
    private double average;
    private Grade grade;

    public Score(String stuName, int kor, int eng, int math) {
        this.stuName = stuName;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}











