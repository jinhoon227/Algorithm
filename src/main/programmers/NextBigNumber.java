package main.programmers;

import java.util.stream.IntStream;

public class NextBigNumber {
    //다음 큰 숫자
    public int solution(int n) {
        return findBigNumber(n);
    }

    public int findBigNumber(int n){
        int oneCounting = Integer.bitCount(n);
        for(int number = n+1; number <= n*2; number++){
            if(oneCounting == Integer.bitCount(number)){
                return number;
            }
        }
        return 0;
    }
}
