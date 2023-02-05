package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Baekjoon1780 {

    // 종이의 개수

    Map<Integer, Integer> numbers = new HashMap<>();

    public void solution() {
        int N = 0;
        int[][] paper = {};
        numbers.put(-1, 0);
        numbers.put(1, 0);
        numbers.put(0, 0);

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
            StringTokenizer st;

            paper = new int[N][N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    paper[i][j] = Integer.parseInt(st.nextToken());
                }
            }
        } catch (Exception e) {

        }
        countPapers(paper, 0, 0, N);
        System.out.println(numbers.get(-1));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
    }

    private void countPapers(int[][] paper, int row, int col, int size) {

        if (checkColor(paper, row, col, size)) {
            numbers.put(paper[row][col], numbers.get(paper[row][col]) + 1);
            return;
        }

        int nextSize = size / 3;

        countPapers(paper, row, col, nextSize);
        countPapers(paper, row, col + nextSize, nextSize);
        countPapers(paper, row, col + 2 * nextSize, nextSize);

        countPapers(paper, row + nextSize, col, nextSize);
        countPapers(paper, row + nextSize, col + nextSize, nextSize);
        countPapers(paper, row + nextSize, col + 2 * nextSize, nextSize);

        countPapers(paper, row + 2 * nextSize, col, nextSize);
        countPapers(paper, row + 2 * nextSize, col + nextSize, nextSize);
        countPapers(paper, row + 2 * nextSize, col + 2 * nextSize, nextSize);


    }

    private boolean checkColor(int[][] paper, int row, int col, int nextSize) {
        int start = paper[row][col];
        for (int i = row; i < row + nextSize; i++) {
            for (int j = col; j < col + nextSize; j++) {
                if (paper[i][j] != start) {
                    return false;
                }
            }
        }
        return true;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1780().solution();
//    }
//}