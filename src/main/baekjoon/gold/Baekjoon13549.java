package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon13549 {

    // 숨바꼭질 3
    int N;
    int K;
    public void solution() {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
        } catch (Exception e) {

        }

        System.out.println(find());
    }

    private int find() {
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[200001];
        Arrays.fill(visited, Integer.MAX_VALUE);

        q.offer(N);
        visited[N] = 0;

        while (!q.isEmpty()) {
            int current = q.poll();

            if (current == K) {
                break;
            }

            if (current <= K && visited[current * 2] == Integer.MAX_VALUE ) {
                visited[current * 2] = visited[current];
                q.offer(current * 2);
            }

            if (current - 1 >= 0 && visited[current - 1] == Integer.MAX_VALUE ) {
                visited[current - 1] = visited[current] + 1;
                q.offer(current - 1);
            }

            if (current + 1 <= 2 * K && visited[current + 1] == Integer.MAX_VALUE) {
                visited[current + 1] = visited[current] + 1;
                q.offer(current + 1);
            }
        }

        return visited[K];
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon13549().solution();
//    }
//}