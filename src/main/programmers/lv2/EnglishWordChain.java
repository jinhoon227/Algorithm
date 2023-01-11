package main.programmers.lv2;

import java.util.HashSet;
import java.util.Set;

public class EnglishWordChain {

    // 영어 끝말잇기
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> usingWords = new HashSet<>();
        usingWords.add(words[0]);
        char startAlphabet;
        char endAlphabet = words[0].charAt(words[0].length() - 1);
        for (int order = 1; order < words.length; order++) {
            startAlphabet = words[order].charAt(0);
            if (!(startAlphabet == endAlphabet && usingWords.add(words[order]))) {
                answer[0] = (order % n) + 1;
                answer[1] = (order / n) + 1;
                break;
            }
            endAlphabet = words[order].charAt(words[order].length() - 1);
        }

        return answer;
    }
}
