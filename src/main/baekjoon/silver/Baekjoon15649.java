package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Baekjoon15649 {

    // N과 M (1)
    public void solution() {

        int N = 0;
        int M = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            br.close();
        } catch (IOException e) {
        }
        boolean[] visited = new boolean[N + 1];
        printSequence(0, N, M, "", visited);
    }

    private void printSequence(int start, int N, int M, String sequence, boolean[] visited) {
        if (start == M) {
            System.out.println(sequence.trim());
        }

        for (int number = 1; number <= N; number++) {
            if (!visited[number]) {
                visited[number] = true;
                printSequence(start + 1, N, M, sequence + " " + number, visited);
                visited[number] = false;
            }
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon15649().solution();
//    }
//}