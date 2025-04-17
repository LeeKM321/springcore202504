package com.study.springcore.rest;

import lombok.*;

import java.util.List;

@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;
    private int age;
    private List<String> hobbies;


}







