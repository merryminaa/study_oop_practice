package org.example;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {
        // (학점수 X 교과목평균)의 합계
        double multipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();
        // 수강신청 총 학점 수
        int totalCredit = courses.calculateTotalCredit();

        return  multipliedCreditAndCourseGrade / totalCredit;
    }
}
