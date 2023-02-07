package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Baekjoon1309 {

    // 동물원
    public void solution() {

        int N = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
            br.close();
        } catch (IOException e) {
        }

        int[] dp = new int[N + 2];
        dp[1] = 3;
        dp[2] = 7;
        for (int lion = 3; lion <= N + 1; lion++) {
            dp[lion] = (dp[lion - 1] * 2 + dp[lion - 2]) % 9901;
        }

        System.out.println(dp[N]);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1309().solution();
//    }
//}
