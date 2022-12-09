package programmers.lv2;

import main.programmers.lv2.ArcheryCompetition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArcheryCompetitionTest {
    ArcheryCompetition archeryCompetition;

    @BeforeEach
    void beforeEach() {
        archeryCompetition = new ArcheryCompetition();
    }

    @Test
    public void executeSolution(){
        int[] arr1 = {2,1,1,1,0,0,0,0,0,0,0};
        int n = 5;
        int[] answer = {0,2,2,0,1,0,0,0,0,0,0};
        assertThat(archeryCompetition.solution(n, arr1)).isEqualTo(answer);
    }
}
