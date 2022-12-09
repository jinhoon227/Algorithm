package main.programmers.lv2;

import java.util.*;

public class Printer {
    // 프린터
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> printer = new PriorityQueue<>(Collections.reverseOrder());

        for (int priority : priorities) {
            printer.add(priority);
        }

        return countOrder(printer, priorities, location);
    }

    public int countOrder(PriorityQueue<Integer> printer, int[] priorities, int location) {
        int count = 0;
        while (!printer.isEmpty()) {
            for (int index = 0; index < priorities.length; index++) {
                if (priorities[index] == printer.peek()) {
                    if (index == location) {
                        return count + 1;
                    }
                    printer.poll();
                    count++;
                }
            }
        }
        return -1;
    }
}
