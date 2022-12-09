package programmers.lv2;

import main.programmers.lv2.RepeatConvertBinary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RepeatConvertBinaryTest {

    RepeatConvertBinary repeatConvertBinary;

    @BeforeEach
    void beforeEach() {
        repeatConvertBinary = new RepeatConvertBinary();
    }

    @Test
    public void executeSolution(){
        String s = "110010101001";
        int[] answer = {3,8};
        assertThat(repeatConvertBinary.solution(s)).isEqualTo(answer);
    }
}
