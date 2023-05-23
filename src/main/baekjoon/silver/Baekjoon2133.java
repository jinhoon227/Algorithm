package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon2133 {

    // 타일 채우기
    public void solution() {
        int N = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
        } catch (Exception e) {

        }

        int[] dp = new int[N + 5];
        dp[1] = 0;
        dp[2] = 3;
        dp[3] = 0;
        dp[4] = 11;
        long sum = 2;
        for (int main = 5; main <= N; main++) {
            if (main % 2 == 0) {
                sum = sum + dp[main - 4] * 2L;
                dp[main] = (int) ((sum + dp[main - 2] * 3L));
            } else {
                dp[main] = 0;
            }
        }
        System.out.println(dp[N]);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2133().solution();
//    }
//}
