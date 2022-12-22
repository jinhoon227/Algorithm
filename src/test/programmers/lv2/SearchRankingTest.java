package programmers.lv2;

import main.programmers.lv2.SearchRanking;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchRankingTest {

    SearchRanking searchRanking;

    @BeforeEach
    void beforeEach() {
        searchRanking = new SearchRanking();
    }

    @Test
    void executeSolution() {
        String[] info = {"java backend junior pizza 150", "python frontend senior chicken 210", "python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80", "python backend senior chicken 50"};
        String[] query = {"java and backend and junior and pizza 100", "python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250", "- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150"};
        int[] answer = {1, 1, 1, 1, 2, 4};

        assertThat(searchRanking.solution(info, query)).isEqualTo(answer);
    }
}
