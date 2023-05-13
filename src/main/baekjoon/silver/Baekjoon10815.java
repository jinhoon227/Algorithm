package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Baekjoon10815 {

    // 숫자카드
    public void solution() {
        Set<Integer> numbers = new HashSet<>();
        StringBuilder answer = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                numbers.add(Integer.parseInt(st.nextToken()));
            }

            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                if (numbers.contains(Integer.parseInt(st.nextToken()))) {
                    answer.append(1);
                } else {
                    answer.append(0);
                }
                answer.append(" ");
            }
        } catch (Exception e) {

        }
        System.out.println(answer);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon10815().solution();
//    }
//}