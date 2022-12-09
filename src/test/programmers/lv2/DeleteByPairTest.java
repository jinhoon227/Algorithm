package programmers.lv2;

import main.programmers.lv2.DeleteByPair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeleteByPairTest {
    DeleteByPair deleteByPair;

    @BeforeEach
    void beforeEach() {
        deleteByPair = new DeleteByPair();
    }

    @Test
    public void executeSolution(){
        String s = "baabaa";
        assertThat(deleteByPair.solution(s)).isEqualTo(1);

    }
}
