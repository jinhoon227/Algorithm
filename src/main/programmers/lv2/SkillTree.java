package main.programmers.lv2;

public class SkillTree {

    // 스킬트리
    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        for (String skills : skill_trees) {
            int tree = 0;
            for (int index = 0; index < skills.length(); index++) {
                if (skills.charAt(index) == skill.charAt(tree)) {
                    tree++;
                    if (tree == skill.length()) {
                        break;
                    }
                } else if (skill.contains(skills.charAt(index) + "")) {
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}
