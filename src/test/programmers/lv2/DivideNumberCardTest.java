package programmers.lv2;

import main.programmers.lv2.DivideNumberCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DivideNumberCardTest {

    DivideNumberCard divideNumberCard;

    @BeforeEach
    void beforeEach() {
        divideNumberCard = new DivideNumberCard();
    }

    @Test
    public void executeSolution(){
        int[] arr1 = {10, 20};
        int[] arr2 = {5, 17};
        divideNumberCard.solution(arr1, arr2);
        assertThat(divideNumberCard.solution(arr1, arr2)).isEqualTo(10);
    }
}
