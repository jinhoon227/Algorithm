package programmers.lv2;

import main.programmers.lv2.EmoticonDiscountEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmoticonDiscountEventTest {

    EmoticonDiscountEvent emoticonDiscountEvent;

    @BeforeEach
    void beforeEach() {
        emoticonDiscountEvent = new EmoticonDiscountEvent();
    }

    @Test
    void executeSolution() {
        int[][] users = {{40, 10000},{25, 10000}};
        int[] emoticons = {7000, 9000};
        int[] result = {1, 5400};
        assertThat(emoticonDiscountEvent.solution(users,emoticons)).isEqualTo(result);
    }
}
