package main.programmers.lv2;

public class FindingBiggestSquare {

    // 가장 큰 정사각형 찾기
    public int solution(int[][] board) {
        int answer = 0;
        for (int column = 0; column < board[0].length; column++) {
            if (board[0][column] == 1) {
                answer = 1;
                break;
            }
        }

        for (int row = 1; row < board.length; row++) {
            for (int column = 1; column < board[row].length; column++) {
                if (board[row][column] == 1) {
                    board[row][column] = Math.min(board[row - 1][column],
                            Math.min(board[row][column - 1], board[row - 1][column - 1])) + 1;

                    answer = Math.max(board[row][column], answer);
                }
            }
        }

        return answer * answer;
    }
}
