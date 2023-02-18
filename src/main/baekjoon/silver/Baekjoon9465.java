package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Baekjoon9465 {

    // 스티커
    public void solution() {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            int T = Integer.parseInt(br.readLine());
            while (T-- > 0) {
                int N = Integer.parseInt(br.readLine());
                int[][] sticker = new int[2][N + 1];
                for (int i = 0; i < 2; i++) {
                    st = new StringTokenizer(br.readLine());
                    for (int j = 0; j < N; j++) {
                        sticker[i][j] = Integer.parseInt(st.nextToken());
                    }
                }

                sticker[1][1] += sticker[0][0];
                sticker[0][1] += sticker[1][0];
                for (int i = 2; i < N; i++) {
                    sticker[0][i] += Math.max(sticker[1][i - 1], sticker[1][i - 2]);
                    sticker[1][i] += Math.max(sticker[0][i - 1], sticker[0][i - 2]);
                }

                sb.append(Math.max(sticker[0][N-1], sticker[1][N-1])).append(System.getProperty("line.separator"));
            }
        } catch (Exception e) {

        }
        System.out.println(sb);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon9465().solution();
//    }
//}