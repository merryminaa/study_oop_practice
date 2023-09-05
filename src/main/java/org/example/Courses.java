package org.example;

import java.util.List;

public class Courses {

    private final List<Course> courses; // 일급 컬렉션

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        return courses.stream()
            .mapToDouble(course -> course.multiplyCreditAndCourseGrade())
            .sum();
    }

    public int calculateTotalCredit() {
        return courses.stream()
            .mapToInt(course -> course.getCredit())
            .sum();
    }
}
