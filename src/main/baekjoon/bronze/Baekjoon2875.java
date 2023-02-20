package main.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Baekjoon2875 {

    // 대회 or 인턴
    public void solution() {

        int N = 0;
        int M = 0;
        int K = 0;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
        } catch (Exception e) {
        }

        int answer = Math.min(N/2, M);
        int remain = Math.max(N - 2 * answer, M - answer);
        if (remain < K) {
            answer = (int) (answer - ((K - remain)/3.0));
        }

        System.out.println(answer);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2875().solution();
//    }
//}