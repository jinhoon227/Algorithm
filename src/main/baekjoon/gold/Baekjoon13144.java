package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Baekjoon13144 {

    // List of Unique Numbers
    public void solution() {
        int n = 0;
        int[] numbers = {};
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());

            numbers = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }

        } catch (Exception e) {

        }

        boolean[] unique = new boolean[100001];
        int end = 0;
        long answer = 0;
        for (int start = 0; start < n; start++) {
            while (end < n) {
                if (!unique[numbers[end]]) {
                    unique[numbers[end]] = true;
                    end++;
                } else {
                    break;
                }
            }
            answer += end - start;
            unique[numbers[start]] = false;
        }


        System.out.println(answer);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon13144().solution();
//    }
//}