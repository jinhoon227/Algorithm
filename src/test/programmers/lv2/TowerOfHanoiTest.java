package programmers.lv2;

import main.programmers.lv2.TowerOfHanoi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TowerOfHanoiTest {

    TowerOfHanoi towerOfHanoi;

    @BeforeEach
    void beforeEach() {
        towerOfHanoi = new TowerOfHanoi();
    }

    @Test
    void executeSolution() {
        int n = 2;
        int[][] result = {{1,2}, {1,3}, {2,3}};
        assertThat(towerOfHanoi.solution(n)).isEqualTo(result);
    }
}
