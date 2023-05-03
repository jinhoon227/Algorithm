package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon2812 {

    // 크게 만들기
    public void solution() {
        int N = 0;
        int K = 0;
        String number = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            number = br.readLine();
        } catch (Exception e) {

        }

        System.out.println(deleteString(N, K, number));
    }

    private String deleteString(int N, int K, String number) {
        int delete = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            char cur = number.charAt(i);
            if (delete == K) {
                stack.push(cur);
            } else {
                while (!stack.isEmpty() && stack.peek() < cur) {
                    stack.pop();
                    delete++;
                    if (delete == K) {
                        break;
                    }
                }
                stack.push(cur);
            }
        }

        int length = N - K + delete;
        if (length > N - K) {
            length = N - K;
        }

        return (stackToString(stack)).substring(0, length);
    }

    private String stackToString(Stack<Character> stack) {
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2812().solution();
//    }
//}
