package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon1260 {


    // dfs 와 bfs
    StringBuilder dfs = new StringBuilder();
    StringBuilder bfs = new StringBuilder();

    public void solution() {
        int N = 0;
        int M = 0;
        int V = 0;
        List<List<Integer>> graph = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());

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

        graph.forEach(Collections::sort);

        boolean[] visited = new boolean[N + 1];
        visited[V] = true;
        dfs.append(V);
        dfsRoute(graph, visited, V);
        System.out.println(dfs);

        visited = new boolean[N + 1];
        visited[V] = true;
        bfs.append(V);
        bfsRoute(graph, visited, V);
        System.out.println(bfs);
    }
    private void dfsRoute(List<List<Integer>> graph, boolean[] visited, int start) {

        for (int i = 0; i < graph.get(start).size(); i++) {
            int next = graph.get(start).get(i);
            if(!visited[next]) {
                visited[next] = true;
                dfs.append(" ").append(next);
                dfsRoute(graph, visited, next);
            }
        }
    }

    private void bfsRoute(List<List<Integer>> graph, boolean[] visited, int start) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            start = queue.poll();
            for (int i = 0; i < graph.get(start).size(); i++) {
                int next = graph.get(start).get(i);
                if(!visited[next]) {
                    visited[next] = true;
                    bfs.append(" ").append(next);
                    queue.offer(next);
                }
            }
        }
    }
}


//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1260().solution();
//    }
//}