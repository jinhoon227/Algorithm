package programmers;

import main.programmers.CorrectParentheses;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CorrectParenthesesTest {

    CorrectParentheses correctParentheses;

    @BeforeEach
    void beforeEach() {
        correctParentheses = new CorrectParentheses();
    }

    @Test
    public void executeSolution(){
        String s = "()()";
        assertThat(correctParentheses.solution(s)).isEqualTo(true);
    }
}
