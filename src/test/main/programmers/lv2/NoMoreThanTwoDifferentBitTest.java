package main.programmers.lv2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NoMoreThanTwoDifferentBitTest {

    NoMoreThanTwoDifferentBit noMoreThanTwoDifferentBit;

    @BeforeEach
    void beforeEach() {
        noMoreThanTwoDifferentBit = new NoMoreThanTwoDifferentBit();
    }

    @Test
    void executeSolution() {
        long[] numbers = {1001,337,0,1,333,673,343,221,898,997,121,1015,665,779,891,421,222,256,512,128,100};
        long[] result = {1002, 338, 1, 2, 334, 674, 347, 222, 899, 998, 122, 1019, 666, 781, 893, 422, 223, 257, 513, 129, 101};
        assertThat(noMoreThanTwoDifferentBit.solution(numbers)).isEqualTo(result);
    }

}