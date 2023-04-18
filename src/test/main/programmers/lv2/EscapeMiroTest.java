package main.programmers.lv2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EscapeMiroTest {

    EscapeMiro escapeMiro;

    @BeforeEach
    void beforeEach() {
        escapeMiro = new EscapeMiro();
    }

    @Test
    void executeSolution() {
        String[] map = {"SOOOL", "XXXXO", "OOOOO", "OXXXX", "OOOOE"};
        assertThat(escapeMiro.solution(map)).isEqualTo(16);
    }

}