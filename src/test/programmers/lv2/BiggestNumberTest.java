package programmers.lv2;

import main.programmers.lv2.BiggestNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BiggestNumberTest {

    BiggestNumber biggestNumber;

    @BeforeEach
    void beforeEach() {
        biggestNumber = new BiggestNumber();
    }

    @Test
    void executeSolution() {
        int[] number = {1, 10, 100, 1000, 818, 81, 898, 89, 0, 0};
        String result = "8989881881110100100000";
        assertThat(biggestNumber.solution(number)).isEqualTo(result);
    }

    @Test
    void executeSolution2() {
        int[] number = {0, 0, 0, 0};
        String result = "0";
        assertThat(biggestNumber.solution(number)).isEqualTo(result);
    }
}
