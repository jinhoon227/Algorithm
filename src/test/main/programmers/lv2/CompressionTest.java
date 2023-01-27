package main.programmers.lv2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompressionTest {

    Compression compression;

    @BeforeEach
    void beforeEach() {
        compression = new Compression();
    }

    @Test
    void executeSolution() {
        String msg = "KAKAO";
        int[] answer = {11, 1, 27, 15};
        Assertions.assertThat(compression.solution(msg)).isEqualTo(answer);
    }

}