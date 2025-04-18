package com.study.springcore.score.repository;

import com.study.springcore.score.entity.Grade;
import com.study.springcore.score.entity.Score;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// Spring 컨테이너에 등록된 빈을 이 테스트 클래스에서 활용할 것이다.
@SpringBootTest
class ScoreRepositoryTest {

    @Autowired // 테스트 클래스는 객체가 생성되지 않음 -> 생성자 호출 안됨 -> 필드 주입 해주세요.
    ScoreRepository scoreRepository;

    @Test
    @DisplayName("새로운 성적 정보를 save를 통해 추가한다.")
    void saveTest() {
        Score score = new Score("김춘식3", 100, 100, 100);
        score.setTotal(score.getKor()+ score.getEng()+score.getMath());
        score.setAverage(score.getTotal() / 3.0);

        if (score.getAverage() >= 90) score.setGrade(Grade.A);
        else if (score.getAverage() >= 80) score.setGrade(Grade.B);
        else if (score.getAverage() >= 70) score.setGrade(Grade.C);
        else if (score.getAverage() >= 60) score.setGrade(Grade.D);
        else score.setGrade(Grade.F);

        scoreRepository.save(score);
    }

    @Test
    @DisplayName("학생 번호를 전달하면 해당 학생이 삭제되어야 한다.")
    void deleteTest() {
        int deleteNum = 1;
        scoreRepository.delete(deleteNum);
    }
    
    @Test
    @DisplayName("scores 테이블의 모든 학생을 조회했을 때 학생 수는 3명일 것이다.")
    void selectAllTest() {
        // given: 준비 -> 테스트에 사용할 변수, 입력값 등을 정의하는 곳.

        // when: 실행 -> 테스트를 실행하는 메인 로직
        List<Score> scoreList = scoreRepository.selectAll();

        // then: 검증 -> 예상한 값, 실제 실행한 값을 확인하는 부분.
        // Assertions 클래스가 제공하는 메서드를 통해 (단언 기법) 테스트 통과 조건을 설정.
        scoreList.forEach(System.out::println);
        assertEquals(scoreList.size(), 3);
    }

    @Test
    @DisplayName("3번 학생의 이름은 김춘식2일 것이다.")
    void findOneTest() {
        // given
        int stuNum = 3;
        // when
        Score score = scoreRepository.selectOne(stuNum);
        // then
        assertEquals("김춘식2", score.getStuName());
    }

    

}









