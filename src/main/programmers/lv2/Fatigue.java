package main.programmers.lv2;

public class Fatigue {

    // 피로도
    private boolean[] visited;
    int answer = -1;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        findRoute(k, dungeons, 0);
        return answer;
    }

    private void findRoute(int k, int[][] dungeons, int depth) {
        for (int index = 0; index < dungeons.length; index++) {
            if (!visited[index] && dungeons[index][0] <= k) {
                visited[index] = true;
                findRoute(k - dungeons[index][1], dungeons, depth + 1);
                visited[index] = false;
            }
        }
        answer = Math.max(answer, depth);
    }
}
