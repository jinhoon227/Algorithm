package programmers.lv2;

import main.programmers.lv2.OpenChatting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OpenChattingTest {

    OpenChatting openChatting;

    @BeforeEach
    void beforeEach() {
        openChatting = new OpenChatting();
    }

    @Test
    void executeSolution() {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] result = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};
        assertThat(openChatting.solution(record)).isEqualTo(result);
    }
}
