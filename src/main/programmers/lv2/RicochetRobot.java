package main.programmers.lv2;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class RicochetRobot {

    // 리코쳇 로봇
    char[][] map;
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};

    Point start;
    Point end;

    public int solution(String[] board) {

        int answer = 0;

        map = new char[board.length][board[0].length()];
        int count = 0;
        for (String kans : board) {
            map[count] = kans.toCharArray();
            count++;
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 'R') {
                    start = new Point(j, i);
                } else if (map[i][j] == 'G') {
                    end = new Point(j, i);
                }
            }
        }

        answer = bfs() - 1;
        return answer;
    }

    public int bfs() {

        Queue<Point> q = new LinkedList<>();
        int[][] visited = new int[map.length][map[0].length];
        visited[start.y][start.x] = 1;
        q.offer(start);

        while (!q.isEmpty()) {

            Point cur = q.poll();
            if (cur.equals(end)) {
                return visited[cur.y][cur.x];
            }

            for (int i = 0; i < 4; i++) {
                int nextX = cur.x + dx[i];
                int nextY = cur.y + dy[i];

                while (true) {

                    if (nextX >= 0 && nextX < map[0].length
                            && nextY >= 0 && nextY < map.length
                            && map[nextY][nextX] != 'D') {
                        nextX = nextX + dx[i];
                        nextY = nextY + dy[i];
                    } else {
                        break;
                    }

                }
                nextX -= dx[i];
                nextY -= dy[i];

                if (visited[nextY][nextX] == 0) {
                    visited[nextY][nextX] = visited[cur.y][cur.x] + 1;
                    q.offer(new Point(nextX, nextY));
                }
            }
        }
        return 0;
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
