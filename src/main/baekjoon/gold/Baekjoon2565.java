package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2565 {

    // 전깃줄
    public void solution() {
        int answer = -1;
        int N = 0;
        int[] lines = new int[501];
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
            StringTokenizer st;
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                lines[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
            }
        } catch (Exception e) {

        }

        int[] dp = new int[501];
        for (int i = 1; i <= 500; i++) {
            if (lines[i] != 0) {
                dp[i] = 1;
                for (int j = 1; j < i; j++) {
                    if (lines[i] > lines[j]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                        answer = Math.max(dp[i], answer);
                    }
                }
            }
        }

        System.out.println(N - answer);
    }

}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2565().solution();
//    }
//}