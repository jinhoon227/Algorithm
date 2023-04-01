package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon20040 {

    // 사이클 게임
    int[] parent;

    public void solution() {
        int n = 0;
        int m = 0;


        int answer = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int first = Integer.parseInt(st.nextToken());
                int second = Integer.parseInt(st.nextToken());

                if (union(first, second)) {
                    answer = i + 1;
                    break;
                }
            }
        } catch (Exception e) {

        }

        System.out.println(answer);
    }

    private boolean union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x == y) {
            return true;
        }

        if (x < y) {
            parent[x] = y;
        } else {
            parent[y] = x;
        }

        return false;
    }

    private int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }
}


//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon20040().solution();
//    }
//}