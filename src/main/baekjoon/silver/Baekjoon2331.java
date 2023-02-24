package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon2331 {

    // 반복수열
    public void solution() {
        List<String> sequence = new ArrayList<>();
        String A = "";
        int P = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = st.nextToken();
            P = Integer.parseInt(st.nextToken());
        } catch (Exception e) {

        }

        int finalP = P;
        while (!sequence.contains(A)) {
            sequence.add(A);
            A = String.valueOf(A.chars()
                    .map(c -> (int)Math.pow(c-'0', finalP))
                    .reduce(Integer::sum)
                    .getAsInt());
        }

        System.out.println(sequence.indexOf(A));
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2331().solution();
//    }
//}