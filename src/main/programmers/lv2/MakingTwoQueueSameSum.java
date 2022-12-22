package main.programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class MakingTwoQueueSameSum {

    // 두 큐 합 같게 만들기
    public int solution(int[] queue1, int[] queue2) {
        int count = 0;
        long sumQueue1 = plusQueue(queue1);
        long sumQueue2 = plusQueue(queue2);
        Queue<Integer> realQueue1 = makeQueue(queue1);
        Queue<Integer> realQueue2 = makeQueue(queue2);
        long total = sumQueue1 + sumQueue2;
        long sumForSameSum = total / 2;

        int moveNumber;
        while (sumQueue1 != sumForSameSum) {
            if (realQueue1.isEmpty() || realQueue2.isEmpty()) {
                return -1;
            }

            count++;
            if (sumQueue1 > sumQueue2) {
                moveNumber = realQueue1.poll();
                realQueue2.offer(moveNumber);
                sumQueue1 -= moveNumber;
                sumQueue2 += moveNumber;
            } else {
                moveNumber = realQueue2.poll();
                realQueue1.offer(moveNumber);
                sumQueue1 += moveNumber;
                sumQueue2 -= moveNumber;
            }
        }
        return count;
    }

    private Queue<Integer> makeQueue(int[] queue) {
        Queue<Integer> newQueue = new LinkedList<>();
        for (int number : queue) {
            newQueue.offer(number);
        }
        return newQueue;
    }

    private long plusQueue(int[] queue) {
        long sum = 0;
        for (int number : queue) {
            sum += number;
        }
        return sum;
    }
}
