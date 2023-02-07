package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon1704 {

    // 이분 그래프
    boolean[] binary;
    boolean[] visited;
    String result;
    public void solution() {
        int K;
        int V;
        int E;

        StringBuilder answer = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            K = Integer.parseInt(br.readLine());
            while (K-- > 0) {
                List<List<Integer>> graph = new ArrayList<>();
                st = new StringTokenizer(br.readLine());
                V = Integer.parseInt(st.nextToken());
                E = Integer.parseInt(st.nextToken());
                for (int i = 0; i <= V; i++) {
                    graph.add(new ArrayList<>());
                }

                binary = new boolean[V + 1];
                visited = new boolean[V + 1];

                for (int i = 0; i < E; i++) {
                    st = new StringTokenizer(br.readLine());
                    int first = Integer.parseInt(st.nextToken());
                    int second = Integer.parseInt(st.nextToken());

                    graph.get(first).add(second);
                    graph.get(second).add(first);
                }

                result = "YES";
                for (int i = 1; i <= V; i++) {
                    if (!visited[i]) {
                        visited[i] = true;
                        dfs(i, graph);
                    }
                }

                answer.append(result).append(System.getProperty("line.separator"));
            }
        } catch (Exception e) {

        }
        System.out.print(answer);
    }

    private void dfs(int start, List<List<Integer>> graph) {

        for (int point : graph.get(start)) {

            if (!visited[point]) {
                visited[point] = true;
                binary[point] = !binary[start];
                dfs(point, graph);
            } else {
                if (binary[point] == binary[start]) {
                    result = "NO";
                    return;
                }
            }
        }
    }
}
//
//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1704().solution();
//    }
//}