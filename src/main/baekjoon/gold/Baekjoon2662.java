package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2662 {

    // 기업 투자
    int[] load;
    int[][] investInfo = new int[301][21];
    int[][] dp = new int[301][21];
    int[][] path = new int[301][21];
    int N;
    int M;
    public void solution() {


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            for (int i = 1; i <= N; i++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                for (int j = 1; j <= M; j++) {
                    investInfo[i][j] = Integer.parseInt(st.nextToken());
                }
            }
        } catch (Exception e) {

        }


        for (int i = 1; i <= M; i++) {
            for (int j = 0; j <= N; j++) {
                for (int k = N - j; k >= 0; k--) {
                    if (dp[k][i - 1] + investInfo[j][i] > dp[j + k][i]) {
                        dp[j + k][i] = dp[k][i - 1] + investInfo[j][i];
                        path[j + k][i] = j;
                    }
                }
            }
        }


        StringBuilder sb = new StringBuilder();
        load = new int[N + 1];
        getPath(N, M);

        for (int i = 1; i <= M; i++) {
            sb.append(load[i]).append(' ');
        }

        System.out.println(dp[N][M]);
        System.out.println(sb);
    }

    private void getPath(int n, int m) {
        if (m == 0) {
            return;
        }
        load[m] = path[n][m];
        getPath(n - load[m], m - 1);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2662().solution();
//    }
//}
