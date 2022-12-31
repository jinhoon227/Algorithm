package programmers.lv2;

import main.programmers.lv2.SimilarCantorBit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimilarCantorBitTest {

    SimilarCantorBit similarCantorBit;

    @BeforeEach
    void beforeEach() {
        similarCantorBit = new SimilarCantorBit();
    }

    @Test
    void executeSolution() {
        int n = 3;
        long l = 1;
        long r = 12;
        int result = 8;
        assertThat(similarCantorBit.solution(n,l,r)).isEqualTo(result);
    }

    @Test
    void executeSolution2() {
        int n = 2;
        long l = 1;
        long r = 17;
        int result = 10;
        assertThat(similarCantorBit.solution(n,l,r)).isEqualTo(result);
    }
}
