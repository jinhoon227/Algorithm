package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Baekjoon1783 {

    // 병든 나이트
    public void solution() {
        int N = 0;
        int M = 0;
        int answer = 1;

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
        }catch (Exception e) {}

        if(N == 2){
            answer = 4;
            if (M < 8) {
                answer = ((M - 1) / 2) + 1;
            }
        }

        if (N > 2) {
            answer = M;
            if (M == 5 || M == 6) {
                answer = 4;
            }
            if (M > 6) {
                answer = M - 2;
            }
        }

        System.out.println(answer);
    }

}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1783().solution();
//    }
//}
