package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon2011 {

    // 암호 코드
    public void solution() {
        char[] numbers = {};
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            numbers = br.readLine().toCharArray();
        } catch (Exception e) {

        }

        if (numbers[0] == '0') {
            System.out.println("0");
            return;
        }

        if (numbers.length == 1) {
            System.out.println("1");
            return;
        }

        if (numbers[1] == '0') {
            if (numbers[0] != '1' && numbers[0] != '2') {
                System.out.println("0");
                return;
            }
        }

        int[] dp = new int[numbers.length + 2];
        dp[0] = 1;
        dp[1] = 1;
        if ((numbers[0] == '1' && numbers[1] != '0') ||
                (numbers[0] == '2' && (numbers[1] >= '1' && numbers[1] <= '6'))) {
            dp[1] = 2;
        }


        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] == '0') {
                if (numbers[i - 1] == '1' || numbers[i - 1] == '2') {
                    dp[i] = dp[i - 2];
                } else {
                    System.out.println("0");
                    return;
                }
            } else {
                dp[i] = dp[i - 1];
                if ((numbers[i - 1] == '1' && numbers[i] != '0') ||
                        (numbers[i - 1] == '2' && (numbers[i] >= '1' && numbers[i] <= '6'))) {
                    dp[i] = (dp[i] + dp[i - 2]) % 1000000;
                }
            }
        }

        System.out.println(dp[numbers.length - 1]);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2011().solution();
//    }
//}