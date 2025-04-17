package com.study.springcore;

import com.study.springcore.chap04.Hotel;
import com.study.springcore.chap04.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HotelTest {

    @Test
    void hotelTest() {
        // 스프링 컨테이너(등록한 빈(객체)을 담아놓는 컨테이너)를 로딩하는 객체를 생성.
        // 설정 파일(AppConfig) 클래스에 지정한 형식을 사용
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(AppConfig.class);

        // Hotel 클래스 타입으로 등록된 bean을 리턴받는 메서드
        Hotel hotel = ctx.getBean(Hotel.class);

        hotel.inform();
    }

}
