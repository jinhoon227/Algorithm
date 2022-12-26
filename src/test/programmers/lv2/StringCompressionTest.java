package programmers.lv2;

import main.programmers.lv2.StringCompression;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCompressionTest {

    StringCompression stringCompression;

    @BeforeEach
    void beforeEach() {
        stringCompression = new StringCompression();
    }

    @Test
    void executeSolution() {
        String s = "aabbaccc";
        int result = 7;
        assertThat(stringCompression.solution(s)).isEqualTo(result);
    }

    @Test
    void executeSolution2() {
        String s = "ababcdcdababcdcd";
        int result = 9;
        assertThat(stringCompression.solution(s)).isEqualTo(result);
    }
}
