package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon21940 {

    // 가운데에서
    int[][] city;
    int N;
    int M;
    int K;
    int[] now;

    private static final int INF = Integer.MAX_VALUE;

    public void solution() {


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            city = new int[N + 1][N + 1];
            for (int i = 0; i <= N; i++) {
                for (int j = 0; j <= N; j++) {
                    city[i][j] = INF;
                    if (i == j) {
                        city[i][j] = 0;
                    }
                }
            }

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                city[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
            }

            K = Integer.parseInt(br.readLine());
            now = new int[K];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < K; i++) {
                now[i] = Integer.parseInt(st.nextToken());
            }
        } catch (Exception e) {

        }

        calculateWeight();

        int min = Integer.MAX_VALUE;
        int[] distance = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            int max = 0;
            for (int j = 0; j < K; j++) {
                if(city[now[j]][i] != INF && city[i][now[j]] != INF )
                    max = Math.max(max, city[now[j]][i] + city[i][now[j]]);
            }
            min = Math.min(min, max);
            distance[i] = max;
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if (distance[i] == min) {
                answer.append(i).append(" ");
            }
        }

        System.out.println(answer);
    }

    private void calculateWeight() {

        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (city[i][k] != INF && city[k][j] != INF) {
                        city[i][j] = Math.min(city[i][j], city[i][k] + city[k][j]);
                    }
                }
            }
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon21940().solution();
//    }
//}