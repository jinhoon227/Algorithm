package programmers.lv2;

import main.programmers.lv2.CuttingRoleCake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CuttingRoleCakeTest {

    CuttingRoleCake cuttingRoleCake;

    @BeforeEach
    void beforeEach(){
        cuttingRoleCake = new CuttingRoleCake();
    }

    @Test
    void executeSolution(){
        int[] topping = {1, 1, 1, 1, 1, 1, 1, 2};
        int result = 7;
        assertThat(cuttingRoleCake.solution(topping)).isEqualTo(result);
    }
}
