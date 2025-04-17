package com.study.springcore.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @solution
 * - 객체 생성의 제어권을 Spring에게 모두 넘긴 후
 *   어노테이션 문법을 이용하여 객체 생성 및 빈(자바 객체) 등록 로직을 대폭 감소.
 *
 * @Component - 스프링 컨테이너에 빈으로 등록할 객체이다.
 * @Autowired - 필드, 생성자, setter에 각각 등록 가능
 *              특정 객체가 다른 객체와의 의존성을 가질 때, 의존성 주입을 자동으로 처리해 주는 문법.
 *              생성자에 붙이는 것을 권장.
 * @Qualifier - 특정 타입을 만족하는 빈이 2개 이상일 경우, 스프링이 자체적으로 무엇을 주입할 지
 *              판단할 수 없기 때문에, 별칭 등을 이용해서 주입할 빈을 직접 지목하는 문법.
 */

@Component
public class Hotel {

    // 레스토랑
//    @Autowired
//    @Qualifier("asian")
    private Restaurant restaurant;
    // 헤드쉐프
    private Chef headChef;

    // 호텔이 의존객체를 생성하는 게 아니라, 외부에서 생성자를 통해 전달할 예정.
    public Hotel(@Qualifier("asian") Restaurant restaurant,
                 @Qualifier("kim") Chef headChef) {
        this.restaurant = restaurant;
        this.headChef = headChef;
    }

    // 호텔을 소개하는 기능
    public void inform() {
        System.out.printf("우리 호텔의 레스토랑은 %s 입니다. 그리고 헤드 쉐프는 %s입니다.\n"
                , restaurant.getClass().getSimpleName(),
                headChef.getClass().getSimpleName()); // 단순 클래스명 뽑아오기

        restaurant.order();
    }

}
