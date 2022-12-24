package programmers.lv2;

import main.programmers.lv2.TableHashFunction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TableHashFunctionTest {

    TableHashFunction tableHashFunction;

    @BeforeEach
    void beforeEach() {
        tableHashFunction = new TableHashFunction();
    }

    @Test
    void executeSolution() {
        int[][] data = {{2,2,6},{1,5,10},{4,2,9},{3,8,3}};
        int col = 2;
        int row_begin = 2;
        int row_end = 3;
        int result = 4;
        assertThat(tableHashFunction.solution(data, col, row_begin, row_end)).isEqualTo(result);
    }
}
