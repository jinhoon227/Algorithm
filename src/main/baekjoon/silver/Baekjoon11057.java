package main.baekjoon.silver;

import java.util.Scanner;

class Baekjoon11057 {

    // 오르막 수
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int preSum = 10;
        int[][] dp = new int[N + 1][10];
        for (int number = 0; number <= 9; number++) {
            dp[1][number] = 1;
        }

        for (int depth = 2; depth <= N; depth++) {
            dp[depth][0] = preSum;
            int nowSum = dp[depth][0];
            for (int number = 1; number <= 9; number++) {
                preSum = (preSum - dp[depth - 1][number - 1] + 10_007) % 10_007;
                dp[depth][number] = preSum;
                nowSum += dp[depth][number];
            }
            preSum = nowSum % 10_007;
        }

        System.out.println(preSum);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon11057().solution();
//    }
//}