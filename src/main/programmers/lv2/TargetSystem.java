package main.programmers.lv2;

import java.util.Arrays;
import java.util.Comparator;

public class TargetSystem {

    public int solution(int[][] targets) {

        Arrays.sort(targets, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o2[1] - o1[1];
            }
            return o1[0] - o2[0];
        });

        int count = 1;
        int s = 0;
        int e = 100000000;
        for (int[] target : targets) {
            int start = target[0];
            int end = target[1];

            if (start >= s && end <= e) {
                s = start;
                e = end;
            } else if (start < e && end >= e) {
                s = start;
            }

            if (e <= start) {
                s = start;
                e = end;
                count++;
            }
        }
        return count;
    }
}
