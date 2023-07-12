package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon15650 {

    // N과 M(2)
    static StringBuilder answer = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N, M;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        combinationBy(N, M, 1, 0,"");

        System.out.println(answer);
    }

    private static void combinationBy(int n, int m, int start, int count, String word) {

        if (count == m) {
            answer.append(word.trim()).append(System.getProperty("line.separator"));
            return;
        }

        for (int cur = start; cur <= n; cur++) {
            combinationBy(n, m, cur + 1, count + 1, word + cur + " ");
        }
    }
}
