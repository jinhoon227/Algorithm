package programmers.lv2;

import main.programmers.lv2.Cash;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CashTest {

    Cash cash;

    @BeforeEach
    void beforeEach() {
        cash = new Cash();
    }

    @Test
    void executeSolution() {
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int result = 50;
        assertThat(cash.solution(cacheSize, cities)).isEqualTo(result);
    }
}
