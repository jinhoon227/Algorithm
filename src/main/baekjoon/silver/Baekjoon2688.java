package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon2688 {

    // 줄어들지 않아
    public void solution() {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());

            while (T-- > 0) {
                int n = Integer.parseInt(br.readLine());
                long[][] dp = new long[n + 1][10];
                for (int i = 0; i <= 9; i++) {
                    dp[0][i] = 1;
                }

                for (int i = 1; i <= n; i++) {
                    long sum  = 0;
                    for (int j = 0; j <= 9; j++) {
                        dp[i][j] = dp[i - 1][j] + sum;

                        sum += dp[i - 1][j];
                    }
                }

                long answer = 0;
                for (int i = 0; i <= 9; i++) {
                    answer = dp[n][i];
                }
                sb.append(answer).append(System.getProperty("line.separator"));
            }
        } catch (Exception e) {

        }
        System.out.println(sb);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2688().solution();
//    }
//}