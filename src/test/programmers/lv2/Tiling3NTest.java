package programmers.lv2;

import main.programmers.lv2.Tiling3N;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tiling3NTest {

    Tiling3N tiling3N;

    @BeforeEach
    void beforeEach() {
        tiling3N = new Tiling3N();
    }

    @Test
    void executeSolution() {
        int n = 6;
        int result = 41;
        assertThat(tiling3N.solution(n)).isEqualTo(result);
    }
    @Test
    void executeSolution2() {
        int n = 8;
        int result = 153;
        assertThat(tiling3N.solution(n)).isEqualTo(result);
    }

    @Test
    void executeSolution3() {
        int n = 5000;
        int result = 658712818;
        assertThat(tiling3N.solution(n)).isEqualTo(result);
    }
}
