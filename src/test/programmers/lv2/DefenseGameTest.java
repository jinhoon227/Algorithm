package programmers.lv2;

import main.programmers.lv2.DefenseGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DefenseGameTest {

    DefenseGame defenseGame;

    @BeforeEach
    void beforeEach() {
        defenseGame = new DefenseGame();
    }

    @Test
    void executeSolution() {
        int n = 7;
        int k = 3;
        int[] enemy = {4, 2, 4, 5, 3, 3, 1};
        assertThat(defenseGame.solution(n, k, enemy)).isEqualTo(5);
    }

    @Test
    void executeSolution2() {
        int n = 2;
        int k = 4;
        int[] enemy = {3, 3, 3, 3};
        assertThat(defenseGame.solution(n, k, enemy)).isEqualTo(4);
    }
}
