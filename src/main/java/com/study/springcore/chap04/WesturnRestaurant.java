package com.study.springcore.chap04;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wes")
public class WesturnRestaurant implements Restaurant {

    private Chef chef;
    private Course course;

    // 클래스에 생성자가 단 한 개 뿐이라면 자동으로 @Autowired를 붙여서 처리.
    public WesturnRestaurant(@Qualifier("john") Chef chef,
                             @Qualifier("w") Course course) {
        this.chef = chef;
        this.course = course;
    }

    public void order() {
        System.out.println("안녕하세요. 서양 레스토랑입니다.");
        chef.cook();
        course.combineMenu();
    }

}
