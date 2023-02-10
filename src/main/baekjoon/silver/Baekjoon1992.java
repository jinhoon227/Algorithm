package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Baekjoon1992 {

    // 쿼드 트리
    StringBuilder answer = new StringBuilder();
    int[][] movie = {};

    public void solution() {
        int N = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());

            movie = new int[N][N];
            for (int i = 0; i < N; i++) {
                String[] numbers = br.readLine().split("");
                for (int j = 0; j < N; j++) {
                    movie[i][j] = Integer.parseInt(numbers[j]);
                }
            }
        } catch (Exception e) {

        }

        makeQuad(0, 0, N);
        System.out.println(answer);
    }

    private void makeQuad(int row, int col, int size) {

        if (checkBinary(row, col, size)) {
            answer.append(movie[row][col]);
            return;
        }

        int nextSize = size / 2;

        answer.append("(");

        makeQuad(row, col, nextSize);
        makeQuad(row, col + nextSize, nextSize);
        makeQuad(row + nextSize, col, nextSize);
        makeQuad(row + nextSize, col + nextSize, nextSize);

        answer.append(")");
    }

    private boolean checkBinary(int row, int col, int size) {
        int first = movie[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (movie[i][j] != first) {
                    return false;
                }
            }
        }
        return true;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1992().solution();
//    }
//}