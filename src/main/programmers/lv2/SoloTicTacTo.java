package main.programmers.lv2;

public class SoloTicTacTo {

    // 혼자 하는 틱택토
    char[][] ttt;

    public int solution(String[] board) {

        int answer = 0;

        ttt = new char[board.length][board[0].length()];
        int count = 0;
        for (String kans : board) {
            ttt[count] = kans.toCharArray();
            count++;
        }

        int numberO = checkPiece('O');
        int numberX = checkPiece('X');
        int total = numberX + numberO;
        boolean completeO = checkComplete('O');
        boolean completeX = checkComplete('X');

        if (numberO == numberX || numberO == numberX + 1) {

            if (!completeO && !completeX) {
                answer = 1;
            }

            if (completeO && total % 2 == 1 && !completeX) {
                answer = 1;
            }

            if (completeX && total % 2 == 0 && !completeO) {
                answer = 1;
            }

            if (total == 9) {

            }
        }

        return answer;
    }

    private int checkPiece(int piece) {

        int count = 0;

        for (int i = 0; i < ttt.length; i++) {
            for (int j = 0; j < ttt[0].length; j++) {
                if (ttt[i][j] == piece) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean checkComplete(int piece) {

        return (ttt[0][0] == ttt[0][1] && ttt[0][1] == ttt[0][2] && ttt[0][0] == piece)
                || (ttt[1][0] == ttt[1][1] && ttt[1][1] == ttt[1][2] && ttt[1][0] == piece)
                || (ttt[2][0] == ttt[2][1] && ttt[2][1] == ttt[2][2] && ttt[2][0] == piece)
                || (ttt[0][0] == ttt[1][0] && ttt[1][0] == ttt[2][0] && ttt[0][0] == piece)
                || (ttt[0][1] == ttt[1][1] && ttt[1][1] == ttt[2][1] && ttt[0][1] == piece)
                || (ttt[0][2] == ttt[1][2] && ttt[1][2] == ttt[2][2] && ttt[0][2] == piece)
                || (ttt[0][0] == ttt[1][1] && ttt[1][1] == ttt[2][2] && ttt[0][0] == piece)
                || (ttt[0][2] == ttt[1][1] && ttt[1][1] == ttt[2][0] && ttt[0][2] == piece);
    }
}
