package com.study.springcore.score.repository;

import com.study.springcore.score.entity.Score;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository // @Component랑 같이 빈등록 하겠다는 아노테이션, 이름으로 좀더 클래스 역할을 명확하게 표시
@RequiredArgsConstructor // 파이널 변수 초기화 전용 생성자.
public class ScoreRepositoryImpl implements ScoreRepository {

    // Spring-jdbc의 핵심 객체. -> 의존성 객체 주입으로 받아와서 사용.
    // 데이터베이스 접속 객체(Connection)을 바로 활용하는 것이 가능 -> 미리 세팅 다 해놓음.
    private final JdbcTemplate template;

    @Override
    public void save(Score score) {
        String sql = "INSERT INTO scores " +
                "(stu_name, kor, eng, math, total, average, grade) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        template.update(sql, score.getStuName(), score.getKor(), score.getEng(),
                score.getMath(), score.getTotal(), score.getAverage(),
                score.getGrade().toString());
    }

    @Override
    public List<Score> selectAll() {
        return List.of();
    }

    @Override
    public Score selectOne(int stuNum) {
        return null;
    }

    @Override
    public void delete(int stuNum) {
        String sql = "DELETE FROM scores WHERE stu_num = ?";
        template.update(sql, stuNum);
    }
}
