package main.programmers.lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesertedIslandTrip {

    // 무인도 여행
    private boolean[][] visited;
    private char[][] map;
    public int[] solution(String[] maps) {
        List<Integer> answer = new ArrayList<>();
        visited = new boolean[maps.length][maps[0].length()];
        map = new char[maps.length][maps[0].length()];
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length(); j++) {
                map[i][j] = maps[i].charAt(j);
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                int temp = dfs(i, j);
                if (temp > 0) {
                    answer.add(temp);
                }
            }
        }

        Collections.sort(answer);
        if (answer.isEmpty()) {
            return new int[]{-1};
        } else {
            return answer.stream()
                    .mapToInt(i -> i)
                    .toArray();
        }
    }

    private int dfs(int row, int col) {
        if (row < 0 || row == map.length || col < 0 || col == map[0].length || visited[row][col] || map[row][col] == 'X') {
            return 0;
        }

        int res = map[row][col] - '0';
        visited[row][col] = true;

        res += dfs(row, col + 1);
        res += dfs(row + 1, col);
        res += dfs(row - 1, col);
        res += dfs(row, col - 1);

        return res;
    }
}
