package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon25556 {

    // 포스택
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

        int[] frontNumber = new int[4];
        String answer = "YES";
        for (int i = 0; i < N; i++) {

            boolean isPush = false;
            for (int stack = 0; stack < 4; stack++) {

                isPush = frontNumber[stack] < numbers[i];
                if (isPush) {
                    frontNumber[stack] = numbers[i];
                    break;
                }
            }

            if (!isPush) {
                answer = "NO";
                break;
            }
        }

        System.out.println(answer);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon25556().solution();
//    }
//}