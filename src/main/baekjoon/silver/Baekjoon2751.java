package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Baekjoon2751 {

    // 수 정렬2
    public void solution() {
        int T = 0;
        int[] numbers = {};
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            T = Integer.parseInt(br.readLine());
            numbers = new int[T];
            for (int i = 0; i < T; i++) {
                numbers[i] = Integer.parseInt(br.readLine());
            }
        } catch (Exception e) {
        }

        Arrays.sort(numbers);
        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            sb.append(number).append(System.getProperty("line.separator"));
        }
        System.out.println(sb);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2751().solution();
//    }
//}
