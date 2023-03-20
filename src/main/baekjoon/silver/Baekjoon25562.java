package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon25562 {

    // 차의 개수
    public void solution() {
        int N = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
        } catch (Exception e) {

        }

        StringBuilder sb = new StringBuilder();
        int max = N * (N - 1) / 2;
        sb.append(max).append(System.getProperty("line.separator"));

        int start = 1;
        sb.append(start).append(" ");
        for (int i = 1; i < N; i++) {
            start *= 2;
            sb.append(start).append(" ");
        }

        sb.append(System.getProperty("line.separator"));
        int min = N - 1;
        sb.append(min).append(System.getProperty("line.separator"));

        start = 1;
        sb.append(start).append(" ");
        for (int i = 1; i < N; i++) {
            start++;
            sb.append(start).append(" ");
        }

        System.out.println(sb);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon25562().solution();
//    }
//}