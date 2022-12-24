package programmers.lv2;

import main.programmers.lv2.CandidateKey;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CandidateKeyTest {

    CandidateKey candidateKey;

    @BeforeEach
    void beforeEach() {
        candidateKey = new CandidateKey();
    }

    @Test
    void executeSolution() {
        String[][] relation = {{"100", "ryan", "music", "2"},
                {"200", "apeach", "math", "2"},
                {"300", "tube", "computer", "3"},
                {"400", "con", "computer", "4"},
                {"500", "muzi", "music", "3"},
                {"600", "apeach", "music", "2"}};
        int result = 2;
        assertThat(candidateKey.solution(relation)).isEqualTo(result);
    }

    @Test
    void executeSolution2() {
        String[][] relation = {{"100", "100"},
                {"200", "150"}};
        int result = 2;
        assertThat(candidateKey.solution(relation)).isEqualTo(result);
    }

    @Test
    void executeSolution3() {
        String[][] relation = {{"a", "1", "aaa", "c", "ng"},
                {"b", "1", "bbb", "c", "g"},
                {"c", "1", "aaa", "d", "ng"},
                {"d", "2", "bbb", "d", "ng"}};
        int result = 3;
        assertThat(candidateKey.solution(relation)).isEqualTo(result);
    }

    @Test
    void executeSolution4() {
        String[][] relation = {{"a", "1", "aaa", "c", "ng"},
                {"a", "1", "bbb", "e", "g"},
                {"c", "1", "aaa", "d", "ng"},
                {"d", "2", "bbb", "d", "ng"}};
        int result = 5;
        assertThat(candidateKey.solution(relation)).isEqualTo(result);
    }
}
