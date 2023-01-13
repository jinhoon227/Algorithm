package programmers.lv2;

import main.programmers.lv2.WayOfLine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WayOfLineTest {

    WayOfLine wayOfLine;

    @BeforeEach
    void beforeEach() {
        wayOfLine = new WayOfLine();
    }

    @Test
    void executeSolution() {
        int n = 3;
        int k = 5;
        int[] result = {3, 1, 2};
        assertThat(wayOfLine.solution(n, k)).isEqualTo(result);
    }

    @Test
    void executeSolution2() {
        int n = 4;
        int k = 2;
        int[] result = {1,2,4,3};
        assertThat(wayOfLine.solution(n, k)).isEqualTo(result);
    }
}
