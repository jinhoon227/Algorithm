package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon11055 {

    // 가장 큰 증가 부분 수열
    public void solution() {
        int N = 0;
        int max = 0;
        int[] sequence = {};
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            sequence = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                sequence[i] = Integer.parseInt(st.nextToken());
            }
        } catch (Exception e) {

        }

        int[] dp = new int[N + 1];
        dp[1] = sequence[1];
        for (int i = 2; i <= N; i++) {

            dp[i] = sequence[i];
            for (int j = 1; j < i; j++) {
                if (sequence[i] > sequence[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + sequence[i]);
                }
            }
        }
        Arrays.sort(dp);
        System.out.println(dp[N]);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon11055().solution();
//    }
//}