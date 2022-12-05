package main.programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class DrawDot {
    // 점 찍기
    public long solution(int k, int d) {
        long answer = 0;
        List<Integer> dots = makeDot(k, d);
        return countXYDots(dots, k, d);
    }

    private long countXYDots(List<Integer> dots, long k, long d) {
        long count = 0;
        for (long xDot : dots) {
            count += ((long)(Math.sqrt(d*d - xDot*xDot)) / k) + 1L;
        }
        return count;
    }

    private List<Integer> makeDot(int k, int d) {
        List<Integer> dots = new ArrayList<>();
        int dot;
        for (int number = 0; number <= d; number++) {
            dot = number * k;
            if (dot > d) {
                break;
            }
            dots.add(dot);
        }
        return dots;
    }
}
