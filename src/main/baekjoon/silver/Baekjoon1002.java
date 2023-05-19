package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1002 {

    // 터렛
    public void solution() {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            int T = Integer.parseInt(br.readLine());
            int[] oneTurret = new int[3];
            int[] twoTurret = new int[3];
            while (T-- > 0) {
                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < 3; i++) {
                    oneTurret[i] = Integer.parseInt(st.nextToken());
                }

                for (int i = 0; i < 3; i++) {
                    twoTurret[i] = Integer.parseInt(st.nextToken());
                }

                int turretDistance = (int) (Math.pow(oneTurret[0] - twoTurret[0], 2) +
                                        Math.pow(oneTurret[1] - twoTurret[1], 2));

                int answer = 0;
                int plusDiameter = (int) (Math.pow(oneTurret[2], 2) + Math.pow(twoTurret[2], 2) + 2 * oneTurret[2] * twoTurret[2]);
                int minusDiameter = (int) (Math.pow(oneTurret[2], 2) + Math.pow(twoTurret[2], 2) - 2 * oneTurret[2] * twoTurret[2]);
                if (turretDistance == 0 && oneTurret[2] == twoTurret[2]) {
                    answer = -1;
                } else if (plusDiameter > turretDistance && minusDiameter < turretDistance) {
                    answer = 2;
                } else if (plusDiameter == turretDistance || minusDiameter == turretDistance) {
                    answer = 1;
                }
                sb.append(answer).append(System.getProperty("line.separator"));
            }

        } catch (Exception e) {

        }

        System.out.println(sb);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1002().solution();
//    }
//}