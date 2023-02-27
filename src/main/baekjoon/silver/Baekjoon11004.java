package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Baekjoon11004 {

    // K 번째 수
    public void solution() {
        int[] numbers = {};
        int K = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            numbers = new int[N];
            for (int i = 0; i < N; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }
        } catch (Exception e) {

        }
        Arrays.sort(numbers);
        System.out.println(numbers[K - 1]);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon11004().solution();
//    }
//}