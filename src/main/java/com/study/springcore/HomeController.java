package com.study.springcore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller // Component랑 똑같이 빈등록 한거임. 이름으로 역할을 구분할라고 쓰는 것.
@RestController// 컨트롤러 역할 빈을 등록하겠다. REST 방식으로 응답을 할 거야.
public class HomeController {

    public HomeController() {
        System.out.println("HomeController 생성됨!!!! 내가한거 아님!");
    }

    @GetMapping("/hello")
    public String home() {
        System.out.println("서버에 요청 들어옴!");
        return "hello";
    }

}










