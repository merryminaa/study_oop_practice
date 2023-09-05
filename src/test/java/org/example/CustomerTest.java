package org.example;

import static org.assertj.core.api.Assertions.assertThatCode;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 음식점에서의 음식주문 과정
 *
 * 요구사항
 * 1. 도메인을 구성하는 객체: 손님, 메뉴판, 돈까스/냉면/만두, 요리사, 요리
 * 2. 객체간 관계 설정
 *  ㄴ 손님 -- 메뉴판
 *  ㄴ 손님 -- 요리사
 *  ㄴ 요리사 -- 요리
 * 3. 동적인 객체를 정적인 타입으로 추상화하여 도메인 모델링
 *  ㄴ 손님 -- 손님 타입
 *  ㄴ 돈까스/냉면/만두 -- 요리 타입
 *  ㄴ 메뉴 -- 메뉴 타입
 *  ㄴ 메뉴 -- 메뉴타입
 * 4. 협력 설계
 * 5. 객체를 포함하는 타입에 적절한 책임 할당
 * 6. 구현
 */
public class CustomerTest {

    @DisplayName("메뉴이름에 해당하는 요리를 주문한다")
    @Test
    void orderTest() {
        Customer customer = new Customer();
        Menu menu = new Menu(List.of(
            new MenuItem("돈까스", 5000),
            new MenuItem("냉면", 7000)
        ));
        Cooking cooking = new Cooking();

        assertThatCode(() -> customer.order("돈까스", menu, cooking))
            .doesNotThrowAnyException();
    }
}
