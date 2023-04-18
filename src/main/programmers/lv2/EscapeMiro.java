package main.programmers.lv2;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class EscapeMiro {

    // 미로 탈출
    char[][] cMaps;
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};

    Point start;
    Point lever;
    Point end;

    public int solution(String[] maps) {
        cMaps = new char[maps.length][maps[0].length()];
        int count = 0;
        for (String map : maps) {
            cMaps[count] = map.toCharArray();
            count++;
        }

        for (int i = 0; i < cMaps.length; i++) {
            for (int j = 0; j < cMaps[0].length; j++) {
                if (cMaps[i][j] == 'S') {
                    start = new Point(j, i);
                } else if (cMaps[i][j] == 'L') {
                    lever = new Point(j, i);
                } else if (cMaps[i][j] == 'E') {
                    end = new Point(j, i);
                }
            }
        }

        int first = findByBfs(start, lever);
        int second = findByBfs(lever, end);
        if (first == -1 || second == -1) {
            return -1;
        }
        return first + second - 2;
    }

    int findByBfs(Point start, Point end) {
        Queue<Point> q = new LinkedList<>();
        int[][] visited = new int[cMaps.length][cMaps[0].length];
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
                if (nextX >= 0 && nextX < cMaps[0].length
                        && nextY >= 0 && nextY < cMaps.length
                        && visited[nextY][nextX] == 0
                        && cMaps[nextY][nextX] != 'X') {

                    visited[nextY][nextX] = visited[cur.y][cur.x] + 1;
                    q.offer(new Point(nextX, nextY));
                }
            }
        }
        return -1;
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
