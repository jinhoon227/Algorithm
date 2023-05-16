package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon2785 {

    // List of Unique Numbers
    public void solution() {
        int N = 0;
        int[] chains = {};
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            N = Integer.parseInt(br.readLine());
            chains = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                chains[i] = Integer.parseInt(st.nextToken());
            }
        } catch (Exception e) {

        }
        int count = 0;
        int remains = N - 1;
        Arrays.sort(chains);
        int start = 0;
        while (remains > 0) {
            count++;
            remains--;
            chains[start]--;
            if (chains[start] == 0) {
                start++;
                remains--;
            }
        }

        System.out.println(count);
    }
}


//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2785().solution();
//    }
//}
