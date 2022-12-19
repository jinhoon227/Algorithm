package programmers.lv2;

import main.programmers.lv2.FindingPrime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindingPrimeTest {

    FindingPrime findingPrime;

    @BeforeEach
    void beforeEach() {
        findingPrime = new FindingPrime();
    }

    @Test
    void executeSolution() {
        String numbers = "17";
        int answer = 3;
        assertThat(findingPrime.solution(numbers)).isEqualTo(answer);
    }

    @Test
    void executeSolution2() {
        String numbers = "011";
        int answer = 2;
        assertThat(findingPrime.solution(numbers)).isEqualTo(answer);
    }
}
