package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1976 {

    // 여행가자

    int[] parent;
    public void solution() {

        int N;
        int M;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            N = Integer.parseInt(br.readLine());
            M = Integer.parseInt(br.readLine());

            parent = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                parent[i] = i;
            }

            for (int i = 1; i <= N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= N; j++) {
                    if (Integer.parseInt(st.nextToken()) == 1) {
                        union(i, j);
                    }
                }
            }

            st = new StringTokenizer(br.readLine());
            int start = find(Integer.parseInt(st.nextToken()));
            for (int i = 1; i < M; i++) {
                int now = Integer.parseInt(st.nextToken());

                if (start != find(now)) {
                    System.out.println("NO");
                    return;
                }
            }

        } catch (Exception e) {

        }

        System.out.println("YES");
    }

    private int find(int x) {
        if (x == parent[x]) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    private void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x != y) {
            if (x < y) {
                parent[y] = x;
            } else {
                parent[x] = y;
            }
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1976().solution();
//    }
//}