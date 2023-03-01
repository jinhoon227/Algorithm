package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Baekjoon10971 {

    // 외판원 순회2
    boolean[] visited;
    int bestCost = Integer.MAX_VALUE;

    public void solution() {
        int N = 0;
        int[][] costs = {};
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            N = Integer.parseInt(br.readLine());

            visited = new boolean[N];
            costs = new int[N][N];

            for (int row = 0; row < N; row++) {
                st = new StringTokenizer(br.readLine());
                for (int col = 0; col < N; col++) {
                    costs[row][col] = Integer.parseInt(st.nextToken());
                }
            }
        } catch (Exception e) {

        }

        visited[0] = true;
        dfs(0, 0, costs, 0);
        System.out.println(bestCost);
    }

    private void dfs(int start, int depth, int[][] costs, int cost) {

        if (depth == costs.length - 1) {
            if(costs[start][0] != 0) {
                bestCost = Math.min(bestCost, cost + costs[start][0]);
            }
            return;
        }

        for (int i = 0; i < costs.length; i++) {
            if (!visited[i] && costs[start][i] != 0) {
                visited[i] = true;
                dfs(i, depth + 1, costs, cost + costs[start][i]);
                visited[i] = false;
            }
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon10971().solution();
//    }
//}