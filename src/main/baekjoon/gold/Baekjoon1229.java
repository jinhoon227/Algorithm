package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon1229 {

    // 육각수
    public void solution() {
        int N = 0;
        int[] six = new int[20000];
        List<Integer> sixPolygon = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
        } catch (Exception e) {

        }

        int count = 2;
        sixPolygon.add(1);
        int number = 6;
        while (number <= 1000000) {
            sixPolygon.add(number);
            number = number + 4 * count + 1;
            count++;
        }

        int[] dp = new int[N + 1];
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1;
            for (int j = 0; j < sixPolygon.size(); j++) {
                if (sixPolygon.get(j) > i) {
                    break;
                }
                dp[i] = Math.min(dp[i], dp[i - sixPolygon.get(j)] + 1);
            }
        }

        System.out.println(dp[N]);
    }

}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1229().solution();
//    }
//}
