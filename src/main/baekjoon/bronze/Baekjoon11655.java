package main.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Baekjoon11655 {

    // ROT13
    public void solution() {
        String word = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            word = br.readLine();
        } catch (Exception e) {

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(c <= 'Z' && c >= 'A') {
                c += 13;
                if (c > 'Z') {
                    c -= 26;
                }
            }

            if (c >= 'a' && c <= 'z') {
                c += 13;
                if (c > 'z') {
                    c -= 26;
                }
            }

            sb.append(c);
        }
        System.out.println(sb);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon11655().solution();
//    }
//}