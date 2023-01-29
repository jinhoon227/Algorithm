package main.baekjoon.silver;

import java.util.*;

class Baekjoon1149 {

    // RGB 거리
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] house = new int[N][3];
        for (int i = 0; i < N; i++) {
            house[i][0] = sc.nextInt();
            house[i][1] = sc.nextInt();
            house[i][2] = sc.nextInt();
        }

        for (int i = 1; i < N; i++) {
            house[i][0] += Math.min(house[i-1][1], house[i-1][2]);
            house[i][1] += Math.min(house[i-1][0], house[i-1][2]);
            house[i][2] += Math.min(house[i-1][0], house[i-1][1]);
        }


        System.out.println(Math.min(house[N-1][0], Math.min(house[N-1][1], house[N-1][2])));
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1149().solution();
//    }
//}