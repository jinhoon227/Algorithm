package main.programmers.lv2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class BiggestNumber {

    // 가장 큰 수
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        PriorityQueue<String> orderedNumber = new PriorityQueue<>((o1, o2) -> {
            String number1 = o1 + o2;
            String number2 = o2 + o1;

            return number2.compareTo(number1);
        });

        for(int number : numbers) {
            orderedNumber.offer(number+"");
        }

        while (!orderedNumber.isEmpty()) {
            answer.append(orderedNumber.poll());
        }

        if(answer.charAt(0) == '0') {
            answer = new StringBuilder("0");
        }

        return answer.toString();
    }
}
