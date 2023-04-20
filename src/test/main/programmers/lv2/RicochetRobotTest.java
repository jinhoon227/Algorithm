package main.programmers.lv2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RicochetRobotTest {

    RicochetRobot ricochetRobot;

    @BeforeEach
    void beforeEach() {
        ricochetRobot = new RicochetRobot();
    }

    @Test
    void executeSolution() {
        String[] map = {"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."};
        assertThat(ricochetRobot.solution(map)).isEqualTo(7);
    }
}