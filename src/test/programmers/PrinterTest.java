package programmers;

import main.programmers.DiscountEvent;
import main.programmers.Printer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrinterTest {

    Printer printer;

    @BeforeEach
    void beforeEach() {
        printer = new Printer();
    }

    @Test
    public void executeSolution(){
        int[] arr1 = {1, 1, 9, 1, 1, 1};
        assertThat(printer.solution(arr1, 0)).isEqualTo(5);
        int[] arr2 = {2, 3, 3, 2, 9, 3, 3};
        assertThat(printer.solution(arr2, 3)).isEqualTo(6);
    }
}
