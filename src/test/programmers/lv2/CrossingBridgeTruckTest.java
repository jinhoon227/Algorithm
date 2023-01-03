package programmers.lv2;

import main.programmers.lv2.CrossingBridgeTruck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CrossingBridgeTruckTest {

    CrossingBridgeTruck crossingBridgeTruck;

    @BeforeEach
    void beforeEach() {
        crossingBridgeTruck = new CrossingBridgeTruck();
    }

    @Test
    void executeSolution() {
        int bridgeLength = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        int result = 8;
        assertThat(crossingBridgeTruck.solution(bridgeLength,weight,truck_weights)).isEqualTo(result);
    }
}
