package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2491 {

    // 수열
    public void solution() {
        int N = 0;
        int[] numbers = {};
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
            numbers = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }
        } catch (Exception e) {

        }

        int answer = Integer.MIN_VALUE;
        int count = 1;
        for (int i = 1; i < N; i++) {
            if (numbers[i - 1] <= numbers[i]) {
                count++;
            } else {
                answer = Math.max(answer, count);
                count = 1;
            }
        }
        answer = Math.max(answer, count);

        count = 1;
        for (int i = 1; i < N; i++) {
            if (numbers[i - 1] >= numbers[i]) {
                count++;
            } else {
                answer = Math.max(answer, count);
                count = 1;
            }
        }
        answer = Math.max(answer, count);

        System.out.println(answer);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2491().solution();
//    }
//}