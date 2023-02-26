package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Baekjoon10816 {

    // 숫자 카드2
    public void solution() {
        StringBuilder answer = new StringBuilder();
        HashMap<Integer, Integer> numberCards = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                int number = Integer.parseInt(st.nextToken());
                numberCards.put(number, numberCards.getOrDefault(number, 0) + 1);
            }

            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < M; i++) {
                answer.append(numberCards.getOrDefault(Integer.parseInt(st.nextToken()), 0))
                        .append(" ");
            }
        } catch (Exception e) {

        }

        System.out.println(answer);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon10816().solution();
//    }
//}