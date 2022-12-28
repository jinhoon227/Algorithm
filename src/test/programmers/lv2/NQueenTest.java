package programmers.lv2;

import main.programmers.lv2.NQueen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NQueenTest {

    NQueen nQueen;

    @BeforeEach
    void beforeEach() {
        nQueen = new NQueen();
    }

    @Test
    void executeSolution() {
        int n = 4;
        int result = 2;
        assertThat(nQueen.solution(4)).isEqualTo(result);
    }
}
