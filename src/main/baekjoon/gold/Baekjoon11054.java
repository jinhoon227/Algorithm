package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon11054 {

    // 가장 긴 바이토닉 부분 수열
    public void solution() {
        int N = 0;
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

        int[] ascDp = new int[N + 1];
        ascDp[1] = 1;
        for (int i = 2; i <= N; i++) {

            ascDp[i] = 1;
            for (int j = 1; j < i; j++) {
                if (sequence[i] > sequence[j]) {
                    ascDp[i] = Math.max(ascDp[i], ascDp[j] + 1);
                }
            }
        }

        int[] descDp = new int[N + 1];
        descDp[N] = 1;
        for (int i = N - 1; i > 0; i--) {

            descDp[i] = 1;
            for (int j = N; j > i; j--) {
                if (sequence[i] > sequence[j]) {
                    descDp[i] = Math.max(descDp[i], descDp[j] + 1);
                }
            }
        }

        int[] sum = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            sum[i] = ascDp[i] + descDp[i] - 1;

        }

        Arrays.sort(sum);
        System.out.println(sum[N]);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon11054().solution();
//    }
//}