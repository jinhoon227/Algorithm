package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Baekjoon1697 {

    // 숨바꼭질
    int K = 0;
    int[] visited = new int[100001];

    public void solution() {
        int N = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
        } catch (Exception e) {

        }

        System.out.println(bfs(N));
    }

    private int bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = 1;

        while (!q.isEmpty()) {

            int point = q.poll();
            if (point == K) {
                return visited[K] - 1;
            }

            int plus = point + 1;
            int minus = point - 1;
            int jump = point * 2;
            if (plus <= 100000 && visited[plus] == 0) {
                visited[plus] = visited[point] + 1;
                q.offer(plus);
            }

            if (minus >= 0 && visited[minus] == 0) {
                visited[minus] = visited[point] + 1;
                q.offer(minus);
            }

            if (jump <= 100000 && visited[jump] == 0) {
                visited[jump] = visited[point] + 1;
                q.offer(jump);
            }
        }
        return -1;
    }

}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1697().solution();
//    }
//}