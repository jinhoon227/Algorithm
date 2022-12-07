package programmers;

import main.programmers.ParcelBox;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParcelBoxTest {

    ParcelBox parcelBox;

    @BeforeEach
    void beforeEach() {
        parcelBox = new ParcelBox();
    }

    @Test
    void executeSolution() {
        int[] order = {5, 4, 3, 2, 1};
        assertThat(parcelBox.solution(order)).isEqualTo(5);
    }
}
