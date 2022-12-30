package programmers.lv2;

import main.programmers.lv2.MagicElevator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MagicElevatorTest {

    MagicElevator magicElevator;

    @BeforeEach
    void beforeEach() {
        magicElevator = new MagicElevator();
    }

    @Test
    void executeSolution() {
        int n = 6;
        int result = 5;
        assertThat(magicElevator.solution(n)).isEqualTo(result);
    }

    @Test
    void executeSolution2() {
        int n = 4;
        int result = 4;
        assertThat(magicElevator.solution(n)).isEqualTo(result);
    }

    @Test
    void executeSolution3() {
        int n = 16;
        int result = 6;
        assertThat(magicElevator.solution(n)).isEqualTo(result);
    }

    @Test
    void executeSolution4() {
        int n = 2554;
        int result = 16;
        assertThat(magicElevator.solution(n)).isEqualTo(result);
    }

    @Test
    void executeSolution5() {
        int n = 56;
        int result = 9;
        assertThat(magicElevator.solution(n)).isEqualTo(result);
    }

    @Test
    void executeSolution6() {
        int n = 5;
        int result = 5;
        assertThat(magicElevator.solution(n)).isEqualTo(result);
    }

    @Test
    void executeSolution7() {
        int n = 556;
        int result = 13;
        assertThat(magicElevator.solution(n)).isEqualTo(result);
    }

    @Test
    void executeSolution9() {
        int n = 54;
        int result = 9;
        assertThat(magicElevator.solution(n)).isEqualTo(result);
    }

    @Test
    void executeSolution10() {
        int n = 5555;
        int result = 18;
        assertThat(magicElevator.solution(n)).isEqualTo(result);
    }

    @Test
    void executeSolution11() {
        int n = 100000001;
        int result = 2;
        assertThat(magicElevator.solution(n)).isEqualTo(result);
    }
}
