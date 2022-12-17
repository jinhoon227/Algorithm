package programmers.lv2;

import main.programmers.lv2.TargetNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TargetNumberTest {

    TargetNumber targetNumber;

    @BeforeEach
    void beforeEach() {
        targetNumber = new TargetNumber();
    }

    @Test
    void executeSolution() {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        int answer = 5;
        assertThat(targetNumber.solution(numbers, target)).isEqualTo(answer);
    }

    @Test
    void executeSolution2() {
        int[] numbers = {4, 1, 2, 1};
        int target = 4;
        int answer = 2;
        assertThat(targetNumber.solution(numbers, target)).isEqualTo(answer);
    }
}
