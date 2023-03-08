package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Baekjoon10819 {

    // 차이를 최대로
    int max = Integer.MIN_VALUE;

    public void solution() {
        int N = 0;
        int[] numbers = {};
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            numbers = new int[N];

            for (int i = 0; i < N; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }
        } catch (Exception e) {

        }
        boolean[] visited = new boolean[N];
        findAnswer(numbers, visited, 0, Integer.MAX_VALUE, 0);

        System.out.println(max);
    }

    private void findAnswer(int[] numbers, boolean[] visited, int start, int previous, int value) {

        if (start == numbers.length) {
            max = Math.max(max, value);
            return;
        }


        for (int i = 0; i < numbers.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                if (previous != Integer.MAX_VALUE) {
                    findAnswer(numbers, visited, start + 1, numbers[i], value + Math.abs(numbers[i] - previous));
                } else {
                    findAnswer(numbers, visited, start + 1, numbers[i], value);
                }

                visited[i] = false;
            }
        }

    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon10819().solution();
//    }
//}