package main.programmers.lv2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MineMineralTest {

    MineMineral mineMineral;

    @BeforeEach
    void beforeEach() {
        mineMineral = new MineMineral();
    }

    @Test
    void executeSolution() {
        int[] picks = {0, 1, 1};
        String[] mineral = {"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"};
        assertThat(mineMineral.solution(picks, mineral)).isEqualTo(50);
    }

}