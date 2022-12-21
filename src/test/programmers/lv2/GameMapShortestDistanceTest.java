package programmers.lv2;

import main.programmers.lv2.GameMapShortestDistance;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameMapShortestDistanceTest {

    GameMapShortestDistance gameMapShortestDistance;

    @BeforeEach
    void beforeEach() {
        gameMapShortestDistance = new GameMapShortestDistance();
    }

    @Test
    void executeSolution() {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        int answer = 11;
        assertThat(gameMapShortestDistance.solution(maps)).isEqualTo(answer);
    }
}
