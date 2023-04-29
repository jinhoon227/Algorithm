package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon24480 {

    // 알고리즘 수업 - 깊이 우선 탐색 2
    boolean[] visited;
    List<List<Integer>> graph = new ArrayList<>();
    int[] answer = {};
    int count = 1;

    public void solution() {
        int N = 0;
        int M = 0;
        int R = 0;


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            answer = new int[N + 1];
            visited = new boolean[N + 1];

            for (int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int first = Integer.parseInt(st.nextToken());
                int second = Integer.parseInt(st.nextToken());
                graph.get(first).add(second);
                graph.get(second).add(first);
            }
        } catch (Exception e) {

        }

        for (int i = 1; i <= N; i++) {
            graph.get(i).sort(Comparator.reverseOrder());
        }

        visited[R] = true;
        answer[R] = count++;
        dfs(R, N);

        for (int i = 1; i <= N; i++) {
            System.out.println(answer[i]);
        }
    }

    private void dfs(int start, int N) {

        for (int next : graph.get(start)) {
            if (graph.get(next).isEmpty()) {
                continue;
            }

            if(!visited[next]){
                visited[next] = true;
                answer[next] = count++;
                dfs(next, N);
            }
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon24480().solution();
//    }
//}