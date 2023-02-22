package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2805 {

    // 나무자르기
    public void solution() {
        int N = 0;
        int M = 0;
        int[] trees = {};
        int max = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            trees = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                trees[i] = Integer.parseInt(st.nextToken());
                max = Math.max(max, trees[i]);
            }
        } catch (Exception e) {

        }

        System.out.println(binarySearch(M, trees, max));
    }

    private int binarySearch(int M, int[] trees, int max) {
        int answer = Integer.MIN_VALUE;
        int low = 0;
        int high = max;
        int mid;
        while (low <= high) {
            long sum = 0;
            mid = (low + high) / 2;
            for (int tree : trees) {
                sum += Math.max(tree - mid, 0);
                if (sum >= M) {
                    low = mid + 1;
                    answer = Math.max(answer, mid);
                    break;
                }
            }

            if (sum < M) {
                high = mid - 1;
            }
        }
        return answer;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2805().solution();
//    }
//}
