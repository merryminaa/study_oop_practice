package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 요구사항
 * 평균학점 계산 방법 = (학점수 X 교과목 평점)의 합계 / 수강신청 총 학점 수
 * 일급 컬렉션 사용
 */
public class GradeCalculatorTest {

    // 객체지향 설계
    // 학점계산기 도메인 도출: 이수과목, 학점계산기
    // 이수과목: 객체지향프로그래밍, 자료구조, 중국어회화 -> 과목 클래스(추상화)
    // 이수과목을 전달하여 평균학점 계산 요청 -> 학점계산기 -> 과목에 작업위임 -> 평균학점 계산


    @DisplayName("평균 학점을 계산한다")
    @Test
    void calculateGradeTest() {

        List<Course> courses = List.of(
            new Course("OOP", 3, "A+"),
            new Course("자료구조", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(courses); // 이수과목 전달
        double res = gradeCalculator.calculateGrade(); // 계산

        assertThat(res).isEqualTo(4.5);

    }
}
