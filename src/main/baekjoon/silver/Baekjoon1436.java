package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Baekjoon1436 {

    // 1 만들기
    public void solution() {
        int N = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
        } catch (Exception e) {}

        int[] dp = new int[N + 3];
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;
        for (int number = 4; number <= N; number++) {
            if(number % 2 == 0 && number % 3 == 0) {
                dp[number] = Math.min(dp[number - 1], Math.min(dp[number / 2], dp[number / 3]));
            } else if (number % 2 == 0) {
                dp[number] = Math.min(dp[number - 1], dp[number / 2]);
            } else if (number % 3 == 0) {
                dp[number] = Math.min(dp[number - 1], dp[number / 3]);
            } else {
                dp[number] = dp[number - 1];
            }
            dp[number] ++;
        }

        System.out.println(dp[N]);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1436().solution();
//    }
//}
