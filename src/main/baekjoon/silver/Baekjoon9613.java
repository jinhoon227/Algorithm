package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Baekjoon9613 {

    // GCD 합
    public void solution() {

        StringBuilder answer = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            int T = Integer.parseInt(br.readLine());
            while (T-- > 0) {
                st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());

                long gcd = 0;
                int[] numbers = new int[n];

                for (int i = 0; i < n; i++) {
                    numbers[i] = Integer.parseInt(st.nextToken());
                    BigInteger big = BigInteger.valueOf(numbers[i]);
                    for (int j = 0; j < i; j++) {
                        gcd += (big.gcd(BigInteger.valueOf(numbers[j]))).intValue();
                    }
                }
                answer.append(gcd)
                        .append(System.getProperty("line.separator"));
            }
        } catch (Exception e) {

        }
        System.out.println(answer);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon9613().solution();
//    }
//}