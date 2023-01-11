package programmers.lv2;

import main.programmers.lv2.CountPrimeInKBinary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountPrimeInKBinaryTest {

    CountPrimeInKBinary countPrimeInKBinary;

    @BeforeEach
    void beforeEach() {
        countPrimeInKBinary = new CountPrimeInKBinary();
    }

    @Test
    void executeSolution() {
        int n = 110011;
        int k = 10;
        int result = 2;
        assertThat(countPrimeInKBinary.solution(n, k)).isEqualTo(result);
    }

    @Test
    void executeSolution2() {
        int n = 524287;
        int k = 2;
        int result = 1;
        assertThat(countPrimeInKBinary.solution(n, k)).isEqualTo(result);
    }
}
