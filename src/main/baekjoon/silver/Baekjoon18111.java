package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon18111 {

    // 마인크래프트
    int N;
    int M;
    int B;
    int[][] ground;
    public void solution() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            ground = new int[N][M];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    ground[i][j] = Integer.parseInt(st.nextToken());
                }
            }
        } catch (Exception e) {

        }


        int cost = Integer.MAX_VALUE;
        int high = 0;
        for (int floor = 0; floor <= 256; floor++) {

            int minusBlock = 0;
            int plusBlock = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (ground[i][j] < floor) {
                        plusBlock += floor - ground[i][j];
                    }

                    if (ground[i][j] > floor) {
                        minusBlock += ground[i][j] - floor;
                    }
                }
            }

            if (minusBlock + B >= plusBlock) {
                int time = minusBlock * 2 + plusBlock;
                if (time <= cost) {
                    cost = time;
                    high = floor;
                }
            }
        }

        System.out.println(cost + " " + high);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon18111().solution();
//    }
//}