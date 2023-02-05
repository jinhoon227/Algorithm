package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1654 {

    // 랜선 자르기
    public void solution() {
        int max = Integer.MIN_VALUE;
        int N = 0;
        int K = 0;
        int[] lan = {};
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            lan = new int[N];
            for (int i = 0; i < N; i++) {
                int number = Integer.parseInt(br.readLine());
                max = Math.max(max, number);
                lan[i] = number;
            }
        } catch (Exception e) {

        }

        long low = 1;
        long high = max;
        long answer = Integer.MIN_VALUE;
        long mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += lan[i] / mid;
            }

            if (sum < K) {
                high = mid - 1;
            } else {
                low = mid + 1;
                answer = Math.max(answer, mid);
            }
        }

        System.out.println(answer);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1654().solution();
//    }
//}