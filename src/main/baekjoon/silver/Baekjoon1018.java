package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1018 {

    // 체스판 다시 칠하기
    int N;
    int M;
    boolean[][] board;
    int answer = Integer.MAX_VALUE;
    public void solution() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            board = new boolean[N][M];
            for (int row = 0; row < N; row++) {
                String rows = br.readLine();
                for (int col = 0; col < M; col++) {
                    if ((rows.charAt(col)) == 'B') {
                        board[row][col] = true;
                    }
                }
            }
        } catch (Exception e) {

        }

        for (int rowStart = 0; rowStart <= N - 8; rowStart++) {
            for (int colStart = 0; colStart <= M - 8; colStart++) {
                checkChess(rowStart, colStart, true);
                checkChess(rowStart, colStart, false);
            }
        }
        System.out.println(answer);
    }

    private void checkChess(int rowStart, int colStart, boolean start) {
        int count = 0;
        for (int row = 0; row < 8; row++) {
            start = !start;
            for (int col = 0; col < 8; col++) {
                if (board[rowStart + row][colStart + col] != start) {
                    count++;
                }
                start = !start;
            }
        }
        answer = Math.min(answer, count);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1018().solution();
//    }
//}