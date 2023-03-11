package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon2422 {

    // 한윤정이 이탈리아에 가서 아이스크림을 사먹는데
    public void solution() {
        int[][] badComb = new int[201][201];
        int N = 0;
        int M = 0;
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());


            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int first = Integer.parseInt(st.nextToken());
                int second = Integer.parseInt(st.nextToken());
                badComb[first][second] = 1;
                badComb[second][first] = 1;
            }
        } catch (Exception e) {

        }

        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                for (int k = j + 1; k <= N; k++) {
                    if (badComb[i][j] == 0 && badComb[i][k] == 0 && badComb[j][k] == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2422().solution();
//    }
//}