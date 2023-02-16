package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Baekjoon2193 {

    // 이친수
    public void solution() {
        int N = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
        } catch (Exception e) {
        }

        long[][] dp = new long[N + 1][2];
        dp[1][1] = 1;

        for (int unit = 2; unit <= N; unit++) {
            dp[unit][0] = dp[unit - 1][0] + dp[unit - 1][1];
            dp[unit][1] = dp[unit - 1][0];
        }

        System.out.println(dp[N][0] + dp[N][1]);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2193().solution();
//    }
//}

