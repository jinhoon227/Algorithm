package programmers.lv2;

import main.programmers.lv2.VowelDictionary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VowelDictionaryTest {

    VowelDictionary vowelDictionary;

    @BeforeEach
    void beforeEach() {
        vowelDictionary = new VowelDictionary();
    }

    @Test
    void executeSolution() {
        String word = "AAAAE";
        assertThat(vowelDictionary.solution(word)).isEqualTo(6);
    }

    @Test
    void executeSolution2() {
        String word = "AAAE";
        assertThat(vowelDictionary.solution(word)).isEqualTo(10);
    }

    @Test
    void executeSolution3() {
        String word = "I";
        assertThat(vowelDictionary.solution(word)).isEqualTo(1563);
    }

    @Test
    void executeSolution4() {
        String word = "EIO";
        assertThat(vowelDictionary.solution(word)).isEqualTo(1189);
    }
}
