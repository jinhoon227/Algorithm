package main.programmers.lv2;

import java.util.HashSet;
import java.util.Set;

public class FindingPrime {

    // 소수 찾기
    // 백트래킹 활용
    Set<Integer> primes;

    public int solution(String numbers) {
        primes = new HashSet<>();
        boolean[] visited = new boolean[numbers.length()];
        findPrime(numbers, "", visited);
        return primes.size();
    }

    private void findPrime(String numbers, String currentNumber, boolean[] visited) {
        if (isPrime(currentNumber)) {
            primes.add(Integer.parseInt(currentNumber));
        }
        if (currentNumber.length() == numbers.length()) {
            return;
        }
        for (int index = 0; index < numbers.length(); index++) {
            if(!visited[index]) {
                visited[index] = true;
                findPrime(numbers, currentNumber + numbers.charAt(index), visited);
                visited[index] = false;
            }
        }
    }

    private boolean isPrime(String stringNumber) {
        if(stringNumber.isEmpty()){
            return false;
        }
        int number = Integer.parseInt(stringNumber);
        if(number <= 1){
            return false;
        }
        for (int index = 2; index <= (int) Math.sqrt(number); index++) {
            if (number % index == 0) {
                return false;
            }
        }
        return true;
    }
}
