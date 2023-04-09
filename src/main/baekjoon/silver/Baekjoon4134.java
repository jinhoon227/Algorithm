package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Baekjoon4134 {

    // 다음소수
    public void solution() {

        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            while (T-- > 0) {
                BigInteger nextPrimeNumber = new BigInteger(String.valueOf(br.readLine()));

                if (nextPrimeNumber.isProbablePrime(10)) {
                    sb.append(nextPrimeNumber).append(System.getProperty("line.separator"));
                } else {
                    sb.append(nextPrimeNumber.nextProbablePrime()).append(System.getProperty("line.separator"));
                }
            }
        } catch (Exception e) {

        }
        System.out.println(sb);
    }

}
