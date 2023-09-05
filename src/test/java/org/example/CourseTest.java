package org.example;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CourseTest {

    @DisplayName("과목을 생성한다")
    @Test
    void createTest() {
        assertThatCode(() -> new Course("OOP", 3, "A+"))
            .doesNotThrowAnyException();
    }
}
