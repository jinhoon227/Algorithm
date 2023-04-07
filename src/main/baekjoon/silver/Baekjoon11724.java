package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Baekjoon11724 {

    // 연결 요소의 개수

    boolean[] visited;
    public void solution() {
        int N = 0;
        int M = 0;
        List<List<Integer>> graph = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            visited = new boolean[N];
            for (int i = 0; i < N; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int first = Integer.parseInt(st.nextToken()) - 1;
                int second = Integer.parseInt(st.nextToken()) - 1;
                graph.get(first).add(second);
                graph.get(second).add(first);
            }
        } catch (Exception e) {

        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                dfs(i, graph);
                count++;
            }
        }
        System.out.println(count);
    }

    private void dfs(int start, List<List<Integer>> graph) {

        for (int i = 0; i < graph.get(start).size(); i++) {
            int next = graph.get(start).get(i);
            if (!visited[next]) {
                visited[next] = true;
                dfs(next, graph);
            }
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon11724().solution();
//    }
//}
