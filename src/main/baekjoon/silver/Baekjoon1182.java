package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 부분수열의 합
class Baekjoon1182 {

    int N;
    int S;
    int[] numbers;
    boolean[] visited;
    int count = 0;
    public void solution() {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            S = Integer.parseInt(st.nextToken());

            numbers = new int[N];
            visited = new boolean[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }
        } catch (Exception e) {

        }
        dfs(0, 0);

        System.out.println(count);
    }

    private void dfs(int start, int sum) {

        if (sum == S && start != 0) {
            count++;
        }

        if (start >= N) {
            return;
        }

        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i + 1, sum + numbers[i]);
                visited[i] = false;
            }
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1182().solution();
//    }
//}