package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon2012 {

    // 등수 매기기
    public void solution() {
        int N = 0;
        List<Integer> grade = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());


            for (int i = 0; i < N; i++) {
                grade.add(Integer.parseInt(br.readLine()));
            }
        } catch (Exception e) {

        }

        Collections.sort(grade);
        long complain = 0;
        for (int i = 1; i <= N; i++) {
            complain += Math.abs(i - grade.get(i - 1));
        }

        System.out.println(complain);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2012().solution();
//    }
//}