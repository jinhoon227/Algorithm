package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Baekjoon1504 {

    // 특정한 최단 경로
    int N;
    int E;
    int[][] graph;
    int v1;
    int v2;
    private static final int INF = 200000000;

    public void solution() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());

            graph = new int[N + 1][N + 1];
            for (int i = 0; i <= N; i++) {
                for (int j = 0; j <= N; j++) {
                    graph[i][j] = INF;
                    if (i == j) {
                        graph[i][j] = 0;
                    }
                }
            }

            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int first = Integer.parseInt(st.nextToken());
                int second = Integer.parseInt(st.nextToken());
                int weight = Integer.parseInt(st.nextToken());

                graph[first][second] = weight;
                graph[second][first] = weight;
            }

            st = new StringTokenizer(br.readLine());
            v1 = Integer.parseInt(st.nextToken());
            v2 = Integer.parseInt(st.nextToken());

        } catch (Exception e) {

        }

        long result1 = dijkstra(1, v1) + dijkstra(v1, v2) + dijkstra(v2, N);
        long result2 = dijkstra(1, v2) + dijkstra(v2, v1) + dijkstra(v1, N);

        if (result1 >= INF && result2 >= INF) {
            System.out.println("-1");
        } else {
            System.out.println(Math.min(result1, result2));
        }

    }

    private int dijkstra(int start, int end) {
        int[] d = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            d[i] = graph[start][i];
        }

        boolean[] visited = new boolean[N + 1];
        visited[start] = true;

        for (int i = 1; i <= N; i++) {

            int cur = 0;
            int min = INF;
            for (int k = 1; k <= N; k++) {
                if (!visited[k] && d[k] < min) {
                    min = d[k];
                    cur = k;
                }
            }

            visited[cur] = true;
            for (int j = 1; j <= N; j++) {
                if (!visited[j]) {
                    if (d[cur] + graph[cur][j] < d[j]) {
                        d[j] = d[cur] + graph[cur][j];
                    }
                }
            }
        }

        return d[end];
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1504().solution();
//    }
//}