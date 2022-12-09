package programmers.lv1;

import main.programmers.lv1.NearestSameLetter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NearestSameLetterTest {

    NearestSameLetter nearestSameLetter;

    @BeforeEach
    void beforeEach() {
        nearestSameLetter = new NearestSameLetter();
    }

    @Test
    void executeSolution() {
        String s = "banana";
        int[] result = {-1, -1, -1, 2, 2, 2};
        assertThat(nearestSameLetter.solution(s)).isEqualTo(result);
    }
}
