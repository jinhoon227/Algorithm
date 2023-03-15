package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon10844 {

    // 계단 오르기
    public void solution() {
        int N = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
        } catch (Exception e) {
        }

        int[][] dp = new int[N + 1][10];
        for (int number = 1; number <= 9; number++) {
            dp[1][number] = 1;
        }

        for (int depth = 2; depth <= N; depth++) {
            for (int number = 1; number <= 8; number++) {
                dp[depth][number] = (dp[depth - 1][number - 1] + dp[depth - 1][number + 1]) % 1_000_000_000;
            }
            dp[depth][0] = dp[depth - 1][1] % 1_000_000_000;
            dp[depth][9] = dp[depth - 1][8] % 1_000_000_000;
        }


        long sum = 0;
        for (int number = 0; number <= 9; number++) {
            sum += dp[N][number];
        }
        System.out.println(sum % 1_000_000_000);
    }

}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon10844().solution();
//    }
//}
