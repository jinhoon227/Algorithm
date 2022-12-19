package main.programmers.lv2;

import java.util.List;

public class VowelDictionary {

    private List<String> dictionary;
    private int count;
    private int answer;

    // 모음 사전
    public int solution(String word) {
        dictionary = List.of("A", "E", "I", "O", "U", "");
        count = -1;
        findWord(word, "", 5);
        return answer;
    }

    private void findWord(String word, String currentWord, int index) {
        count++;
        currentWord += dictionary.get(index);
        if (word.equals(currentWord)) {
            answer = count;
            return;
        }

        if (currentWord.length() == 5) {
            return;
        }
        findWord(word, currentWord, 0);
        findWord(word, currentWord, 1);
        findWord(word, currentWord, 2);
        findWord(word, currentWord, 3);
        findWord(word, currentWord, 4);
    }
}
