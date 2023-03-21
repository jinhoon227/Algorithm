package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Baekjoon11729 {

    // 하노이 탑 이동순서
    int number = 0;
    StringBuilder sb = new StringBuilder();
    public void solution() {
        int N = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
        } catch (Exception e) {

        }

        moveHanoi(1, 3, 2, N);
        System.out.println(number);
        System.out.println(sb);
    }

    private void moveHanoi(int start, int end, int mid, int count) {

        if (count == 1) {
            sb.append(start).append(" ").append(end).append(System.getProperty("line.separator"));
            number++;
            return;
        }

        moveHanoi(start, mid, end, count - 1);
        sb.append(start).append(" ").append(end).append(System.getProperty("line.separator"));
        number++;
        moveHanoi(mid, end, start, count - 1);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon11729().solution();
//    }
//}