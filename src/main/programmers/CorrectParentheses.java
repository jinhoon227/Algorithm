package main.programmers;

import java.util.Stack;

public class CorrectParentheses {
    // 올바른 괄호
    // pop push O(1)
    // add remove 는 List 함수이기에 시간이 더 오래걸림
    public boolean solution(String s) {
        boolean answer = false;
        char[] parentheses = s.toCharArray();
        Stack<Character> validator = new Stack<>();

        for(char unit : parentheses) {
            if (!validator.empty() && validator.peek() == ((unit - 1))){
                validator.pop();
            } else {
                validator.push(unit);
            }
        }

        if(validator.empty()){
            answer = true;
        }
        return answer;
    }
}
