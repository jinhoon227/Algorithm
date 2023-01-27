package main.programmers.lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compression {

    // 압축
    public int[] solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> dictionary = new HashMap<>();
        for (int index = 0; index <= 25; index++) {
            String word = String.valueOf((char) ('A' + index));
            dictionary.put(word, index + 1);
        }

        int count = 27;
        char[] words = msg.toCharArray();
        String word = "";
        for (char c : words) {
            if (!dictionary.containsKey(word + c)) {
                answer.add(dictionary.get(word));
                dictionary.put(word + c, count++);
                word = "";
            }

            word += c;
        }
        answer.add(dictionary.get(word));


        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
