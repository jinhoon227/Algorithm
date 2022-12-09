package programmers.lv2;

import main.programmers.lv2.DiscountEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DiscountEventTest {
    DiscountEvent discountEvent;

    @BeforeEach
    void beforeEach() {
        discountEvent = new DiscountEvent();
    }

    @Test
    public void executeSolution(){
        String[] arr1 = {"banana", "apple", "rice", "pork", "pot"};
        int[] arr2 = {3, 2, 2, 2, 1};
        String[] arr3 = {"chicken", "apple", "apple", "banana", "rice", "apple"
                , "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        assertThat(discountEvent.solution(arr1, arr2, arr3)).isEqualTo(3);
    }
}
