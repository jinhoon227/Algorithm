package main.programmers.lv2;

public class TowerOfHanoi {

    // 하노이의 탑
   private int count;
    public int[][] solution(int n) {
        int[][] answer = new int[(int)Math.pow(2, n) - 1][2];
        count = 0;
        moveBlock(1, 3, 2, n, answer);
        return answer;
    }

    private void moveBlock(int from, int to, int side, int n, int[][] answer) {
        if (n == 1) {
            answer[count][0] = from;
            answer[count++][1] = to;
            return;
        }

        moveBlock(from, side, to, n - 1, answer);
        answer[count][0] = from;
        answer[count++][1] = to;
        moveBlock(side, to, from, n - 1, answer);
    }
}
