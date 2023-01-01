package programmers.lv2;

import main.programmers.lv2.Joystick;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JoystickTest {

    Joystick joystick;

    @BeforeEach
    void beforeEach() {
        joystick = new Joystick();
    }

    @Test
    void executeSolution() {
        String name = "JEROEN";
        int result = 56;
        assertThat(joystick.solution(name)).isEqualTo(result);
    }

    @Test
    void executeSolution2() {
        String name = "BBBBAAAABA";
        int result = 12;
        assertThat(joystick.solution(name)).isEqualTo(result);
    }
}
