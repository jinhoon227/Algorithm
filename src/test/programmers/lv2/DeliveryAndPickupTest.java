package programmers.lv2;

import main.programmers.lv2.DeliveryAndPickup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeliveryAndPickupTest {

    DeliveryAndPickup deliveryAndPickup;

    @BeforeEach
    void beforeEach() {
        deliveryAndPickup = new DeliveryAndPickup();
    }

    @Test
    void executeSolution() {
        int cap = 4;
        int n = 5;
        int[] deliveries = {1, 0, 3, 1, 2};
        int[] pickups = {0, 3, 0, 4, 0};
        long result = 16;
        assertThat(deliveryAndPickup.solution(cap,n,deliveries,pickups)).isEqualTo(result);
    }

    @Test
    void executeSolution2() {
        int cap = 2;
        int n = 2;
        int[] deliveries = {0,0};
        int[] pickups = {0,0};
        long result = 0;
        assertThat(deliveryAndPickup.solution(cap,n,deliveries,pickups)).isEqualTo(result);
    }

    @Test
    void executeSolution3() {
        int cap = 2;
        int n = 7;
        int[] deliveries = {1, 0, 2, 0, 1, 0, 2};
        int[] pickups = {0, 2, 0, 1, 0, 2, 0};
        long result = 30;
        assertThat(deliveryAndPickup.solution(cap,n,deliveries,pickups)).isEqualTo(result);
    }
}
