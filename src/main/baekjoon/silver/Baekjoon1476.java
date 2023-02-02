package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Baekjoon1476 {

    // 날짜 계산
    int one;
    int two;
    int three;

    public void solution() {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            this.one = Integer.parseInt(st.nextToken());
            this.two = Integer.parseInt(st.nextToken());
            this.three = Integer.parseInt(st.nextToken());
        } catch (Exception e) {
        }

        System.out.println(findYear(1, 1, 1, 1));
    }

    private int findYear(int one, int two, int three, int count) {

        if (one > 15) {
            one = 1;
        }

        if (two > 28) {
            two = 1;
        }

        if (three > 19) {
            three = 1;
        }

        if (this.one == one && this.two == two && this.three == three) {
            return count;
        }

        return findYear(one + 1, two + 1, three + 1, count + 1);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1476().solution();
//    }
//}