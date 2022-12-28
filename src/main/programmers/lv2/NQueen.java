package main.programmers.lv2;

public class NQueen {

    // N-Queen
    private int count;

    public int solution(int n) {
        count = 0;
        int[] position = new int[n];
        boolean[] visited = new boolean[n];
        findQueen(position, visited, n, 0);
        return count;
    }

    private void findQueen(int[] position, boolean[] visited, int n, int start) {
        if (start == n) {
            count++;
            return;
        }

        for (int index = 0; index < n; index++) {
            if (!visited[index]) {
                visited[index] = true;
                position[start] = index;
                if (checkQueen(position, start)) {
                    findQueen(position, visited, n, start + 1);
                }
                visited[index] = false;
            }
        }
    }

    private boolean checkQueen(int[] position, int start) {
        for (int queen = 0; queen < start; queen++) {
            if (position[queen] == position[start]) {
                return false;
            }
            if (Math.abs(position[queen] - position[start]) == Math.abs(queen - start)) {
                return false;
            }
        }
        return true;
    }
}
