package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11052 {

    // 카드 구매하기
    public void solution() {
        int N = 0;
        int[] cards = {};

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            N = Integer.parseInt(br.readLine());
            cards = new int[N + 1];

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                cards[i] = Integer.parseInt(st.nextToken());
            }
        } catch (Exception e) {

        }

        int[] dp = new int[N + 1];
        dp[1] = cards[1];

        for (int i = 2; i <= N; i++) {
            dp[i] = cards[i];
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], dp[i - j] + dp[j]);
            }
        }

        System.out.println(dp[N]);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon11052().solution();
//    }
//}