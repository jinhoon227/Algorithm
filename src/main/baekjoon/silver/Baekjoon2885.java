package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon2885 {

    // 초콜릿식사
    public void solution() {
        int K = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            K = Integer.parseInt(br.readLine());
        } catch (Exception e) {

        }

        int chocolate = 1;
        while (chocolate < K) {
            chocolate *= 2;
        }

        int count = 0;
        int piece = chocolate;
        while (K % piece != 0) {
            piece /= 2;
            count++;
        }

        System.out.println(chocolate + " " + count);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2885().solution();
//    }
//}