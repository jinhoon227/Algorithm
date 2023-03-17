package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2891 {

    // 카약과 강풍
    public void solution() {
        int N = 0;
        int S = 0;
        int R = 0;
        boolean[] injureKayak = new boolean[12];
        boolean[] remainKayak = new boolean[12];

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            S = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < S; i++) {
                injureKayak[Integer.parseInt(st.nextToken())] = true;
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < R; i++) {
                remainKayak[Integer.parseInt(st.nextToken())] = true;
            }
        } catch (Exception e) {

        }

        int count = S;

        for (int i = 1; i <= 10; i++) {
            if (injureKayak[i] && remainKayak[i]) {
                injureKayak[i] = false;
                remainKayak[i] = false;
                count--;
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (injureKayak[i]) {
                if (remainKayak[i - 1]) {
                    remainKayak[i - 1] = false;
                    count--;
                } else if (remainKayak[i + 1]) {
                    remainKayak[i + 1] = false;
                    count--;
                }
            }
        }

        System.out.println(count);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2891().solution();
//    }
//}