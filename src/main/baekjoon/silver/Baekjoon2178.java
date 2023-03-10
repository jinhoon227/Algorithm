package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon2178 {

    // 미로 탐색
    int N;
    int M;
    int[][] miro;
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    int[][] visited;

    public void solution() {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            miro = new int[N][M];
            visited = new int[N][M];
            for (int i = 0; i < N; i++) {
                char[] temp = (br.readLine()).toCharArray();
                for (int j = 0; j < M; j++) {
                    miro[i][j] = temp[j] - '0';
                }
            }
        } catch (Exception e) {

        }

        bfs(new Point(0, 0));

        System.out.println(visited[N - 1][M - 1]);
    }

    private void bfs(Point start) {
        Queue<Point> q = new LinkedList<>();
        visited[start.y][start.x] = 1;
        q.offer(start);

        while (!q.isEmpty()) {
            Point current = q.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];

                if (nextX >= 0 && nextX < M && nextY >= 0 && nextY < N && miro[nextY][nextX] == 1) {
                    if (visited[nextY][nextX] == 0) {
                        visited[nextY][nextX] = visited[current.y][current.x] + 1;
                        q.offer(new Point(nextX, nextY));
                    }

                }
            }
        }
    }

}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2178().solution();
//    }
//}