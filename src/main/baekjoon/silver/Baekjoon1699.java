package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon1699 {

    // 제곱수의 합
    public void solution() {
        int N = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
        } catch (Exception e) {

        }

        int[] dp = new int[N + 1];
        dp[1] = 1;

        for (int i = 2; i <= N; i++) {

            dp[i] = dp[i - 1] + 1;
            int temp = (int) Math.sqrt(i);
            if (temp * temp == i) {
                dp[i] = 1;
            } else {
                while (temp * temp >= 1) {
                    int number = temp * temp;
                    dp[i] = Math.min(dp[i], dp[number] + dp[i - number]);
                    temp--;
                }
            }

        }

        System.out.println(dp[N]);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1699().solution();
//    }
//}