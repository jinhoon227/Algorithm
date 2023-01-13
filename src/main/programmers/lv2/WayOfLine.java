package main.programmers.lv2;

import java.util.ArrayList;
import java.util.List;

public class WayOfLine {

    // 줄 서는 방법
    public int[] solution(int n, long k) {
        List<Integer> remains = new ArrayList<>();
        for (int number = 1; number <= n; number++) {
            remains.add(number);
        }

        int[] answer = new int[n];
        int count = n;
        while (count != 0) {
            count--;
            long factorialNumber = makeFactorialNumber(count);
            int index = (int) ((k - 1) / factorialNumber);
            k -= index*factorialNumber;
            answer[n - count - 1] = remains.remove(index);
        }
        return answer;
    }

    private long makeFactorialNumber(int n) {
        long number = 1;
        while (n > 1) {
            number *= n;
            n--;
        }
        return number;
    }
}
