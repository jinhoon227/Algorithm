package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baekjoon2777 {

    // 숫자 놀이
    public void solution() {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            while (T-- > 0) {
                int number = Integer.parseInt(br.readLine());
                sb.append(findNumber(number))
                        .append(System.getProperty("line.separator"));
            }
        } catch (Exception e) {

        }
        System.out.println(sb);
    }

    private int findNumber(int number) {

        StringBuilder answer = new StringBuilder();
        boolean isChanged;

        while (number > 9) {
            isChanged = false;
            for (int i = 9; i >= 2; i--) {
                if (number % i == 0) {
                    answer.append(i);
                    number /= i;
                    isChanged = true;
                    break;
                }
            }
            if (!isChanged) {
                answer.setLength(0);
                break;
            }
        }

        if (number < 10) {
            answer.append(number);
        }

        int count = answer.length();
        if (count == 0) {
            return -1;
        }
        return count;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2777().solution();
//    }
//}