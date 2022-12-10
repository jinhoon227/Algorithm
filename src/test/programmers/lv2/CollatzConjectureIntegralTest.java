package programmers.lv2;

import main.programmers.lv2.CollatzConjectureIntegral;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CollatzConjectureIntegralTest {

    CollatzConjectureIntegral collatzConjectureIntegral;

    @BeforeEach
    void beforeEach() {
        collatzConjectureIntegral = new CollatzConjectureIntegral();
    }

    @Test
    void executeSolution() {
        int k = 5;
        int[][] ranges = {{0, 0}, {0, -1}, {2, -3}, {3, -3}};
        double[] answer = {33.0, 31.5, 0.0, -1.0};
        assertThat(collatzConjectureIntegral.solution(k, ranges)).isEqualTo(answer);
    }
}
