package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon16928 {

    // 뱀과 사다리게임
    int N;
    int M;
    Map<Integer, Integer> ladders = new HashMap<>();

    public void solution() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                ladders.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                ladders.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }
        } catch (Exception e) {

        }

        System.out.println(find(1));
    }

    private int find(int start) {
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[101];
        q.offer(start);

        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == 100) {
                return visited[100];
            }

            for (int dice = 1; dice <= 6; dice++) {
                int next = cur + dice;
                next = ladders.getOrDefault(next, next);
                if (next <= 100 && visited[next] == 0) {
                    visited[next] = visited[cur] + 1;
                    q.offer(next);
                }
            }

        }
        return -1;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon16928().solution();
//    }
//}
