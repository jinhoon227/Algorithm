package main.programmers.lv2;

import java.util.ArrayList;
import java.util.List;

public class CountPrimeInKBinary {

    // k 진수에서 소수 개수 구하기
    public int solution(int n, int k) {
        List<String> primes = new ArrayList<>();
        String kBinary = Integer.toString(n, k);
        String[] numbers = kBinary.replaceAll("0+", "0").split("0");

        for (String number : numbers) {
            if (isPrime(Long.parseLong(number))) {
                primes.add(number);
            }
        }

        return primes.size();
    }

    public boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
