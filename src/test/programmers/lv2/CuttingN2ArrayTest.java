package programmers.lv2;

import main.programmers.lv2.CuttingN2Array;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CuttingN2ArrayTest {

    CuttingN2Array cuttingN2Array;

    @BeforeEach
    void beforeEach() {
        cuttingN2Array = new CuttingN2Array();
    }

    @Test
    void executeSolution() {
        int n = 4;
        int left = 7;
        int right = 14;
        int[] answer = {4, 3, 3, 3, 4, 4, 4, 4};
        assertThat(cuttingN2Array.solution(n, left, right)).isEqualTo(answer);
    }

    @Test
    void executeSolution2() {
        int n = 3;
        int left = 2;
        int right = 5;
        int[] answer = {3, 2, 2, 3};
        assertThat(cuttingN2Array.solution(n, left, right)).isEqualTo(answer);
    }
}
