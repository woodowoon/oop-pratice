package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @DisplayName("패스워드를 초기화한다")
    @Test
    void passwordTest() {
        // given
        // 유저 객체가 주어지고
        User user = new User();

        // when
        // 이 메소드를 호출했을때,
        user.initPassword(new CorrentFixedPasswordGenerator());

        // then
        // password가 isNotNull 라고 기대한다.
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합되지 않아 초기화가 되지 않는다.")
    @Test
    void passwordTest2() {
        // given
        // 유저 객체가 주어지고
        User user = new User();

        // when
        // 이 메소드를 호출했을때,
        user.initPassword(new WrongFixedPasswordGenerator());

        // then
        // password가 isNotNull 라고 기대한다.
        assertThat(user.getPassword()).isNull();
    }

}