package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon2405 {

    // 세 수, 두 M
    public void solution() {
        int n = 0;
        long[] numbers = {};
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());

            numbers = new long[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = Integer.parseInt(br.readLine());
            }
        } catch (Exception e) {

        }

        // find max(a-2b+c) or max(-a+2b-c)
        Arrays.sort(numbers);
        long max = 0;
        for (int i = 1; i < n - 1; i++) {
            max = Math.max(max, Math.abs(2 * numbers[i] - numbers[0] - numbers[i + 1]));
        }

        for (int i = 0; i < n - 2; i++) {
            max = Math.max(max, Math.abs(numbers[numbers.length - 1] + numbers[i] - 2 * numbers[i + 1]));
        }

        System.out.println(max);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2405().solution();
//    }
//}
