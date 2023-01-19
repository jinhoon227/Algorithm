package main.programmers.lv2;

import java.util.*;

public class SeesawPair {

    // 시소 짝궁
    public long solution(int[] weights) {
        long answer = 0;
        Map<Integer, Integer> sitter = new HashMap<>();
        Map<Integer, Integer> original = new HashMap<>();


        for (int weight : weights) {
            answer += sitter.getOrDefault(weight * 2, 0);
            answer += sitter.getOrDefault(weight * 3, 0);
            answer += sitter.getOrDefault(weight * 4, 0);
            answer -= 2L * original.getOrDefault(weight, 0);

            sitter.put(weight * 2, sitter.getOrDefault(weight * 2, 0) + 1);
            sitter.put(weight * 3, sitter.getOrDefault(weight * 3, 0) + 1);
            sitter.put(weight * 4, sitter.getOrDefault(weight * 4, 0) + 1);
            original.put(weight, original.getOrDefault(weight, 0) + 1);
        }
        return answer;
    }
}
