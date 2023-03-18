package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Baekjoon1904 {

    // 01타일
    public void solution() {

        int N = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
            br.close();
        }
        catch (IOException e) { }

        int[] dp = new int[N + 2];
        dp[1] = 1;
        dp[2] = 2;

        for (int index = 3; index <= N; index++) {
            dp[index] = (dp[index - 2] + dp[index - 1]) % 15746;
        }

        System.out.println(dp[N]);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1904().solution();
//    }
//}