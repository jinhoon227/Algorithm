package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Baekjoon10610 {

    // 30
    public void solution() {
        StringBuilder N = new StringBuilder();
        StringBuilder answer = new StringBuilder("-1");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = new StringBuilder(br.readLine());
        } catch (Exception e) {
        }

        int[] number = new int[10];
        int sum = 0;
        for (int i = 0; i < N.length(); i++) {
            number[N.charAt(i) - '0']++;
        }

        for (int i = 1; i <= 9; i++) {
            sum += i * number[i];
        }

        if (number[0] != 0 && sum % 3 == 0) {
            answer.setLength(0);
            for (int i = 9; i >= 0; i--) {
                answer.append((i + "").repeat(number[i]));
            }
        }

        System.out.println(answer);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon10610().solution();
//    }
//}