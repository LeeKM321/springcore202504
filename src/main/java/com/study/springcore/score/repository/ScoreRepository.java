package com.study.springcore.score.repository;

import com.study.springcore.score.entity.Score;

import java.util.List;

// 인터페이스를 제작하는 이유: 해당 인터페이스를 구현하는 모든 구현체가 같은 이름으로 동작하게끔
// 클래스의 틀을 명시, 다형성의 이점을 얻기 위해 작성.
// 게시판 같은 경우 기능이 비슷 -> 각 게시판 객체가 동일한 이름으로 호출될 수 있게 통일.
// 필요하다면 객체를 갈아끼우는 것도 다형성으로 쉽게 구현.
public interface ScoreRepository {

    // 데이터 추가
    void save(Score score);

    // 데이터 전체 조회
    List<Score> selectAll();

    // 데이터 상세 조회
    Score selectOne(int stuNum);

    // 데이터 삭제
    void delete(int stuNum);

}







