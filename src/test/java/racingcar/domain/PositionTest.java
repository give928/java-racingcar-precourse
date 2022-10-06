package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("자동차 위치 관련 기능")
class PositionTest {
    @DisplayName("자동차 위치를 생성한다.")
    @Test
    void create() {
        // when
        Position position = Position.create();

        // then
        assertThat(position).extracting("value")
                .isEqualTo(0);
    }

    @DisplayName("자동차가 전진한다.")
    @Test
    void forward() {
        // given
        Position position = Position.create();

        // when
        int value = position.forward();

        // then
        assertThat(value).isEqualTo(Position.FORWARD_VALUE);
    }
}
