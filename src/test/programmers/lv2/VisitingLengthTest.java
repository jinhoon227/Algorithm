package programmers.lv2;

import main.programmers.lv2.VisitingLength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VisitingLengthTest {

    VisitingLength visitingLength;

    @BeforeEach
    void beforeEach() {
        visitingLength = new VisitingLength();
    }

    @Test
    void executeSolution() {
        String dirs = "LRLRL";
        int result = 1;
        assertThat(visitingLength.solution(dirs)).isEqualTo(result);
    }
}
