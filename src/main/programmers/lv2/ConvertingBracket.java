package main.programmers.lv2;

import java.util.HashMap;
import java.util.Map;

public class ConvertingBracket {

    // 괄호 변환
    Map<Character, Integer> bracketIndex = new HashMap<>();

    public String solution(String p) {
        bracketIndex.put('(', 1);
        bracketIndex.put(')', -1);
        return convertBracket(p);
    }

    private String convertBracket(String p) {
        if (p.equals("")) {
            return "";
        }

        int sum = 0;
        int count = 0;
        boolean isRight = true;
        sum += bracketIndex.get(p.charAt(0));

        while (++count != p.length() && sum != 0) {
            if (sum < 0) {
                isRight = false;
            }
            sum += bracketIndex.get(p.charAt(count));
        }

        String u = p.substring(0, count);
        String v = p.substring(count);

        if (isRight) {
            return u + convertBracket(v);
        }

        String convertingU = "(" + convertBracket(v) + ")";
        for (int index = 1; index < u.length() - 1; index++) {
            if (u.charAt(index) == '(') {
                convertingU += ")";
            } else {
                convertingU += "(";
            }
        }
        return convertingU;
    }
}
