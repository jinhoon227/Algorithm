package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Baekjoon1107 {

    // 리모컨
    int answer = Integer.MAX_VALUE;

    public void solution() {

        int N = 0;
        int M = 0;
        Set<String> buttons = new HashSet<>();
        for (int i = 0; i <= 9; i++) {
            buttons.add(i+"");
        }

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            N = Integer.parseInt(br.readLine());
            M = Integer.parseInt(br.readLine());

            if (M != 0) {
                st = new StringTokenizer(br.readLine());
                for (int i = 0; i < M; i++) {
                    buttons.remove(st.nextToken());
                }
            }
        } catch (Exception e) {

        }

        answer = Math.abs(100 - N);
        findAnswer("", buttons, N);

        System.out.println(answer);
    }

    private void findAnswer(String number, Set<String> buttons, int N) {
        if (number.length() > 6) {
            return;
        }

        for (String button : buttons) {
            String next = number + button;
            answer = Math.min(answer, Math.abs(N - Integer.parseInt(next)) + next.length());

            findAnswer(next, buttons, N);
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1107().solution();
//    }
//}