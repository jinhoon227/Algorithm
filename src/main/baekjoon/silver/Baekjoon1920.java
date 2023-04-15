package main.baekjoon.silver;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Baekjoon1920 {

    // 수 찾기
    public void solution() {

        StringBuilder sb = new StringBuilder();
        Set<Integer> numbers = new HashSet<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int index = 0; index < N; index++) {
                numbers.add(Integer.parseInt(st.nextToken()));
            }

            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine()," ");
            for (int index = 0; index < M; index++) {
                if(numbers.contains(Integer.parseInt(st.nextToken()))) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
                sb.append('\n');
            }

            br.close();
        } catch (IOException e) {}

        System.out.println(sb);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1920().solution();
//    }
//}
