package main.programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class NearestSameLetter {
    // 가장 가까운 같은 글자
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> unitIndex = new HashMap<>();
        char[] word = s.toCharArray();
        for (int index = 0; index < word.length; index++) {
            if (unitIndex.get(word[index]) == null) {
                answer[index] = -1;
            } else {
                answer[index] = index - unitIndex.get(word[index]);
            }

            unitIndex.put(word[index], index);
        }
        return answer;
    }
}
