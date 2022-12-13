package main.programmers.lv2;

import java.util.ArrayList;
import java.util.List;

public class CuttingN2Array {
    // n제곱 배열 자르기
    public int[] solution(int n, long left, long right) {
        int[] answer = {};
        int leftX = (int) (left % n);
        int leftY = (int) (left / n);
        int rightX = (int) (right % n);
        int rightY = (int) (right / n);
        List<Integer> preAnswer = new ArrayList<>();

        for (int y = leftY; y <= rightY; y++) {
            for (int x = 0; x < n; x++) {
                if (x <= y) {
                    preAnswer.add(y + 1);
                } else {
                    preAnswer.add(x + 1);
                }
            }
        }

        preAnswer = preAnswer.subList(leftX, preAnswer.size() + rightX - n + 1);
        return preAnswer.stream()
                .mapToInt(number -> number)
                .toArray();
    }
}
