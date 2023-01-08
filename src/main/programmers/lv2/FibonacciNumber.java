package main.programmers.lv2;

public class FibonacciNumber {

    // 피보나치 수
    public int solution(int n) {
        long[] numbers = new long[n + 1];
        numbers[0] = 0;
        numbers[1] = 1;
        for(int index = 2; index <= n; index++) {
            numbers[index] = (numbers[index - 1] + numbers[index - 2] )% 1234567;
        }
        return (int) (numbers[n]);
    }
}
