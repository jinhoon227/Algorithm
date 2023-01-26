package main.programmers.lv2;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConvertingBracketTest {

    ConvertingBracket convertingBracket;

    @BeforeEach
    void beforeEach() {
        convertingBracket = new ConvertingBracket();
    }

    @Test
    void executeSolution() {
        String p = "(()())()";
        String result = "(()())()";
        Assertions.assertThat(convertingBracket.solution(p)).isEqualTo(result);
    }

    @Test
    void executeSolution2() {
        String p = ")(";
        String result = "()";
        Assertions.assertThat(convertingBracket.solution(p)).isEqualTo(result);
    }

    @Test
    void executeSolution3() {
        String p = "()))((()";
        String result = "()(())()";
        Assertions.assertThat(convertingBracket.solution(p)).isEqualTo(result);
    }

}