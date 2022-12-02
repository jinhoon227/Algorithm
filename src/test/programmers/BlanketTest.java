package programmers;

import main.programmers.ArcheryCompetition;
import main.programmers.Blanket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BlanketTest {
    Blanket blanket;

    @BeforeEach
    void beforeEach() {
        blanket = new Blanket();
    }

    @Test
    public void executeSolution(){
        int yellow = 2;
        int brown = 10;
        assertThat(blanket.solution(brown, yellow)).isEqualTo(new int[]{4, 3});
    }
}
