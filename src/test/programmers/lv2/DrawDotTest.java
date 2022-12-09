package programmers.lv2;

import main.programmers.lv2.DrawDot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DrawDotTest {

    DrawDot drawDot;

    @BeforeEach
    void beforeEach(){
        drawDot = new DrawDot();
    }

    @Test
    void executeSolution(){
        int k = 100000;
        int d = 100000;
        assertThat(drawDot.solution(k,d)).isEqualTo(3);
    }
}
