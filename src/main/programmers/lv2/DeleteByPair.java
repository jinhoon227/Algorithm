package main.programmers.lv2;

import java.util.Stack;

public class DeleteByPair {
    // 짝지어 제거하기
    // 정규식 사용시 시간초과
    public int solution(String s) {
        int answer = 0;
        Stack<Character> uniqueLetter = new Stack<>();
        char[] letters = s.toCharArray();

        s = deletePair(uniqueLetter, letters);

        if (s.length() == 0) {
            answer = 1;
        }

        return answer;
    }

    public String deletePair(Stack<Character> uniqueLetter, char[] letters) {
        for (char letter : letters) {
            if (!uniqueLetter.empty() && uniqueLetter.peek() == letter) {
                uniqueLetter.pop();
            } else {
                uniqueLetter.add(letter);
            }
        }
        return changeStackCharToString(uniqueLetter);
    }

    public static String changeStackCharToString(Stack<Character> stack){
        StringBuilder sb = new StringBuilder();
        stack.forEach(sb::append);
        return sb.toString();
    }
}
