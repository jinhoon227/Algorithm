package programmers.lv2;

import main.programmers.lv2.SkillTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SkillTreeTest {

    SkillTree skillTree;

    @BeforeEach
    void beforeEach() {
        skillTree = new SkillTree();
    }

    @Test
    void executeSolution() {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        int result = 2;
        assertThat(skillTree.solution(skill, skill_trees)).isEqualTo(result);
    }
}
