package com.study.springcore.chap01;

public class WesturnRestaurant {

    private JohnChef chef = new JohnChef();

    private WesturnCourse course = new WesturnCourse();

    public void order() {
        System.out.println("안녕하세요. 서양 레스토랑입니다.");
        chef.cook();
        course.combineMenu();
    }

}
