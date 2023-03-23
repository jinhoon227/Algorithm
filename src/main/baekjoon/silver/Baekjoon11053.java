package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Baekjoon11053 {

    // 가장 긴 증가하는 부분 수열
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
        for (int i = 2; i <= N; i++) {

            for (int j = 1; j <= i; j++) {
                if (sequence[i] > sequence[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }

        System.out.println(max + 1);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon11053().solution();
//    }
//}