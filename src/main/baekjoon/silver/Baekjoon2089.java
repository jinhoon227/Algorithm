package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Baekjoon2089 {

    // -2 진수
    public void solution() {
        int N = 0;
        StringBuilder answer = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
        } catch (Exception e) {

        }

        if (N == 0) {
            System.out.println(0);
            return;
        }

        while (N != 0) {

            if (N % -2 == 0) {
                answer.append(0);
                N /= -2;
            } else {
                answer.append(1);
                N = (N - 1) / -2;
            }
        }

        System.out.println(answer.reverse());
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2089().solution();
//    }
//}