package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon2467 {

    // 용액
    public void solution() {
        int N = 0;
        int[] liquid = {};
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            liquid = new int[N];
            for (int i = 0; i < N; i++) {
                liquid[i] = Integer.parseInt(st.nextToken());
            }
        } catch (Exception e) {

        }

        Arrays.sort(liquid);
        int start = 0;
        int end = liquid.length - 1;
        int firstLiquid = liquid[start];
        int secondLiquid = liquid[end];
        int preLiquid = Math.abs(firstLiquid + secondLiquid);
        while (start < end) {
            int nowLiquid = liquid[start] + liquid[end];
            if (Math.abs(nowLiquid) <= preLiquid) {
                firstLiquid = liquid[start];
                secondLiquid = liquid[end];
                preLiquid = Math.abs(nowLiquid);
            }

            if (nowLiquid < 0) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println(firstLiquid + " " + secondLiquid);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2467().solution();
//    }
//}