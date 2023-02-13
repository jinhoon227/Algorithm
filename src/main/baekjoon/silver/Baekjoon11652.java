package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

class Baekjoon11652 {

    // 카드
    public void solution() {

        int N = 0;
        HashMap<Long, Integer> numbers = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
            while (N-- > 0) {
                Long number = Long.parseLong(br.readLine());
                numbers.put(number, numbers.getOrDefault(number, 0) + 1);
            }
        } catch (Exception e) {
        }
        int max = Integer.MIN_VALUE;
        Long answer = 0L;
        for (Long key : numbers.keySet()) {
            int value = numbers.get(key);
            if (max < value) {
                max = value;
                answer = key;
            }

            if (max == value) {
                if (answer > key) {
                    answer = key;
                }
            }
        }
        System.out.println(answer);
    }
}


//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon11652().solution();
//    }
//}