package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Baekjoon9095 {

    // 1, 2, 3 더하기
    public void solution() {
        int T = 0;
        int[] cases = {};
        int max = -1;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            T = Integer.parseInt(br.readLine());
            cases = new int[T];
            cases[0] = Integer.parseInt(br.readLine());
            max = cases[0];
            for (int i = 1; i < T; i++) {
                cases[i] = Integer.parseInt(br.readLine());
                max = Math.max(max, cases[i]);
            }
        } catch (Exception e) {
        }

        StringBuilder sb = new StringBuilder();

        int[] dp = new int[max + 3];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= max; i++) {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        for (int i = 0; i < T; i++) {
            sb.append(dp[cases[i]]).append(System.getProperty("line.separator"));
        }

        System.out.println(sb);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon9095().solution();
//    }
//}
