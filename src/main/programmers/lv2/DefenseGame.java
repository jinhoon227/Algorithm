package main.programmers.lv2;

import java.util.Collections;
import java.util.PriorityQueue;

public class DefenseGame {
    // 디펜스 게임
    public int solution(int n, int k, int[] enemy) {
        return countStage(n, k, enemy);
    }

    private int countStage(int n, int k, int[] enemy) {
        int count = 0;
        PriorityQueue<Integer> clear = new PriorityQueue<>(Collections.reverseOrder());
        for (int foe : enemy) {
            clear.offer(foe);
            n -= foe;
            count++;
            if (n < 0) {
                if (k != 0) {
                    n += clear.remove();
                    k--;
                } else {
                    return count - 1;
                }
            }
        }
        return enemy.length;
    }
}
