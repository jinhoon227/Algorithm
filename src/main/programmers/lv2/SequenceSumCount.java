package main.programmers.lv2;

import java.util.HashSet;
import java.util.Set;

public class SequenceSumCount {
    // 연속 부분 수열 합의 개수
    public int solution(int[] elements) {
        Set<Integer> results = new HashSet<>();
        int[] circleElements = new int[elements.length * 2];
        for(int index = 0; index < elements.length; index++) {
            circleElements[index] = elements[index];
            circleElements[index + elements.length] = elements[index];
        }

        int sum;
        for(int i = 1; i <= elements.length; i++) {
            for(int j = 0; j < elements.length; j++) {
                sum = 0;
                for(int k = j; k < i+j ; k++){
                    sum += circleElements[k];
                }
                results.add(sum);
            }
        }

        return results.size();
    }
}
