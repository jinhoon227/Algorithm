package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Baekjoon2110 {

    // 공유기 설치
    public void solution() {
        int N = 0;
        int C = 0;
        int[] homes = {};
        int max = Integer.MIN_VALUE;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            homes = new int[N];
            for (int i = 0; i < N; i++) {
                homes[i] = Integer.parseInt(br.readLine());
                max = Math.max(max, homes[i]);
            }
        } catch (Exception e) {

        }

        Arrays.sort(homes);
        int low = 1;
        int high = max;
        int mid = 0;
        int answer = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            int prePoint = homes[0];
            int count = 1;
            for (int i = 1; i < homes.length; i++) {
                if (homes[i] - prePoint >= mid) {
                    prePoint = homes[i];
                    count++;
                }
            }

            if (count >= C) {
                low = mid + 1;
                answer = Math.max(answer, mid);
            } else {
                high = mid - 1;
            }
        }

        System.out.println(answer);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2110().solution();
//    }
//}