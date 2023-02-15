package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Baekjoon1963 {

    // 소수 경로
    int currentPwd;
    int targetPwd;
    int[] visited = new int[10000];
    boolean[] isPrimeNumber = new boolean[10000];

    public void solution() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 9999; i++) {
            isPrimeNumber[i] = isPrime(i);
        }

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            int T = Integer.parseInt(br.readLine());

            while (T-- > 0) {
                visited = new int[10000];
                st = new StringTokenizer(br.readLine());
                currentPwd = Integer.parseInt(st.nextToken());
                targetPwd = Integer.parseInt(st.nextToken());

                countChanging(currentPwd);
                if (visited[targetPwd] == 0) {
                    sb.append("Impossible").append(System.getProperty("line.separator"));
                } else {
                    sb.append(visited[targetPwd] - 1).append(System.getProperty("line.separator"));
                }
            }

        } catch (Exception e) {

        }
        System.out.println(sb);
    }

    private void countChanging(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = 1;

        while (!q.isEmpty()) {
            int number = q.poll();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <= 9; j++) {
                    if (i == 0 && j == 0) {
                        continue;
                    }

                    StringBuilder sb = new StringBuilder(String.valueOf(number));
                    sb.setCharAt(i, (char) (j + '0'));
                    int newPwd = Integer.parseInt(sb.toString());

                    if (isPrimeNumber[newPwd] && visited[newPwd] == 0) {
                        visited[newPwd] = visited[number] + 1;
                        q.add(newPwd);
                    }
                }
            }
        }


    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1963().solution();
//    }
//}