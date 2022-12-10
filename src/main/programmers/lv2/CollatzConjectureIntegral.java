package main.programmers.lv2;

import java.util.ArrayList;
import java.util.List;

public class CollatzConjectureIntegral {
    // 우박수열 정적분
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];
        List<Integer> collatz = makeCollatz(k);

        for (int index = 0; index < ranges.length; index++) {
            answer[index] = calculateArea(ranges[index], collatz);
        }

        return answer;
    }

    private double calculateArea(int[] range, List<Integer> collatz) {
        double area = 0;
        if (range[0] > collatz.size() - 1 + range[1]) {
            return -1.0;
        }

        for (int height = range[0]; height < (collatz.size() + range[1]); height++) {
            area += collatz.get(height);
        }
        area -= (collatz.get(range[0]) + collatz.get(collatz.size() - 1 + range[1])) / 2d;
        return area;
    }

    private List<Integer> makeCollatz(int k) {
        List<Integer> collatz = new ArrayList<>();
        collatz.add(k);
        while (k > 1) {
            if (k % 2 == 0) {
                k /= 2;
            } else {
                k = k * 3 + 1;
            }
            collatz.add(k);
        }
        return collatz;
    }
}
