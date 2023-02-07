package main.programmers.lv2;

import java.util.HashMap;
import java.util.Map;

public class NumberOf124Country {

    // 124 나라의숫자
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> cash = new HashMap<>();
        cash.put(0, 1);
        cash.put(1, 2);
        cash.put(2, 4);

        while (n > 0) {
            n--;
            sb.append(cash.get(n % 3));
            n /= 3;
        }
        return sb.reverse().toString();
    }
}
