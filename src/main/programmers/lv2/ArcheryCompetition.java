package main.programmers.lv2;

import java.util.*;

public class ArcheryCompetition {
    // 양궁대회
    // 완전탐색
    private int[] appeach, ryan;
    int n, max;
    Queue<int[]> answer = new PriorityQueue<>((o1, o2) -> {
        for (int i = 10; i >= 0; i--) {
            if (o1[i] != o2[i]) {
                return o2[i] - o1[i];
            }
        }
        return 0;
    });

    public int[] solution(int n, int[] info) {
        this.appeach = info.clone();
        this.ryan = new int[11];
        this.n = n;
        this.max = -1;

        executeDFS(0, 0);
        if (answer.isEmpty()) {
            return new int[]{-1};
        }
        return answer.poll();
    }

    public void executeDFS(int current, int depth) {
        if (depth == n) {
            int appeachScore = 0;
            int ryanScore = 0;

            for (int i = 0; i < 11; i++) {
                if (appeach[i] < ryan[i]) {
                    ryanScore += 10 - i;
                } else if (appeach[i] != 0) {
                    appeachScore += 10 - i;
                }
            }

            if (ryanScore <= appeachScore || ryanScore - appeachScore < max) {
                return;
            }

            if (ryanScore - appeachScore > max) {
                max = ryanScore - appeachScore;
                answer.clear();
            }
            answer.add(ryan.clone());
            return;
        }

        for (int next = current; next < 11; next++) {
            ryan[next]++;
            executeDFS(next, depth + 1);
            ryan[next]--;
        }
    }
}
