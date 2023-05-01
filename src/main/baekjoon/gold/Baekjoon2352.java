package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2352 {

    // 반도체 설계
    int[] lis;
    public void solution() {
        int n = 0;
        int[] port = {};
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            port = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                port[i] = Integer.parseInt(st.nextToken());
            }
        } catch (Exception e) {

        }

        lis = new int[n + 1];
        int portNumber = 2;
        int lisNumber = 1;
        lis[1] = port[1];
        while (portNumber <= n) {

            if (lis[lisNumber] < port[portNumber]) {
                lis[++lisNumber] = port[portNumber];
            } else {
                int location = binarySearch(1, lisNumber, port[portNumber]);
                lis[location] = port[portNumber];
            }
            portNumber++;
        }

        System.out.println(lisNumber);
    }

    private int binarySearch(int left, int right, int target) {

        while (left < right) {
            int mid = (left + right) / 2;

            if (lis[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2352().solution();
//    }
//}