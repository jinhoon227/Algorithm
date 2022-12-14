package main.programmers.lv2;

public class TriangleSnail {
    // 삼각 달팽이
    public int[] solution(int n) {
        int x = 0;
        int y = -1;
        int nowNumber = 1;
        int[][] triangleSnail = new int[n][n];
        for (int circle = n; circle > 0; circle-=3) {
            for (int phase = 0; phase < circle; phase++) {
                triangleSnail[++y][x] = nowNumber++;
            }
            for (int phase = 0; phase < circle - 1; phase++) {
                triangleSnail[y][++x] = nowNumber++;
            }
            for (int phase = 0; phase < circle - 2; phase++) {
                triangleSnail[--y][--x] = nowNumber++;
            }
        }

        int count = 0;
        int[] answer = new int[nowNumber-1];
        for(int answerY = 0; answerY < n; answerY++) {
            for(int answerX = 0; answerX <= answerY; answerX++){
                answer[count++] = triangleSnail[answerY][answerX];
            }
        }
        return answer;
    }
}
