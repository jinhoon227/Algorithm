package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2854 {

    // 문제 출제
    public void solution() {
        int N = 0;
        int[] fixedLevel = {};
        int[] duelLevel = {};

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            fixedLevel = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                fixedLevel[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            duelLevel = new int[N + 1];
            for (int i = 1; i <= N - 1; i++) {
                duelLevel[i] = Integer.parseInt(st.nextToken());
            }
        } catch (Exception e) {

        }

        int[] dp1 = new int[N + 1];
        int[] dp2 = new int[N + 1];
        dp1[0] = 1;
        for (int i = 1; i <= N; i++) {
            dp1[i] = (int) ((long) (dp1[i - 1] + dp2[i - 1]) * (fixedLevel[i] + duelLevel[i - 1] - 1) + dp1[i - 1]) % 1_000_000_007;

            dp2[i] = (int) ((long)( dp1[i - 1] + dp2[i - 1]) * duelLevel[i]) % 1_000_000_007;
        }

        System.out.println(dp1[N]);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2854().solution();
//    }
//}