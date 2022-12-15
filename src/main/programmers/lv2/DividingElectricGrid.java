package main.programmers.lv2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DividingElectricGrid {

    // 전력망을 둘로 나누기
    private List<Integer>[] electricGrid;

    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        electricGrid = new List[n + 1];
        for (int index = 0; index <= n; index++) {
            electricGrid[index] = new ArrayList<>();
        }

        for (int[] wire : wires) {
            electricGrid[wire[0]].add(wire[1]);
            electricGrid[wire[1]].add(wire[0]);
        }

        for (int[] wire : wires) {
            int distance = Math.abs(countGrid(wire[0], wire[1], n)
                    - countGrid(wire[1], wire[0], n));

            answer = Math.min(answer, distance);
        }

        return answer;
    }

    private int countGrid(int v1, int v2, int n) {
        Queue<Integer> grid = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        int count = 0;
        grid.add(v1);
        visited[v1] = true;

        while (!grid.isEmpty()) {
            int current = grid.poll();
            count++;

            for (int next : electricGrid[current]) {
                if (!visited[next] && next != v2) {
                    visited[next] = true;
                    grid.add(next);
                }
            }
        }

        return count;
    }
}
