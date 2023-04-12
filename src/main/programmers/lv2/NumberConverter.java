package main.programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class NumberConverter {

    // 숫자 변환하기
    private static final int MAX_NUM = 1000_000;

    public int solution(int x, int y, int n) {

        return bfs(x, y, n);
    }

    private int bfs(int x, int y, int n) {
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[MAX_NUM + 1];
        q.offer(x);

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == y) {
                return visited[cur];
            }

            int next = cur + n;
            if (next <= MAX_NUM && visited[next] == 0) {
                visited[next] = visited[cur] + 1;
                q.offer(next);
            }

            next = cur * 2;
            if (next <= MAX_NUM && visited[next] == 0) {
                visited[next] = visited[cur] + 1;
                q.offer(next);
            }

            next = cur * 3;
            if (next <= MAX_NUM && visited[next] == 0) {
                visited[next] = visited[cur] + 1;
                q.offer(next);
            }

        }

        return -1;
    }
}
