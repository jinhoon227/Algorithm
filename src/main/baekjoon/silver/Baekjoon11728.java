package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Baekjoon11728 {

    // 배열합치기
    public void solution() {
        List<Integer> numbers = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                numbers.add(Integer.parseInt(st.nextToken()));
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                numbers.add(Integer.parseInt(st.nextToken()));
            }
        } catch (Exception e) {

        }
        Collections.sort(numbers);
        StringBuilder sb = new StringBuilder();
        numbers.forEach(n -> sb.append(n).append(" "));
        System.out.println(sb);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon11728().solution();
//    }
//}
