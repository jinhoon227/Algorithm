package main.programmers.lv2;

public class NumberBlock {

    // 숫자 블록
    public int[] solution(long begin, long end) {
        int length = (int) (end - begin);
        int[] answer = new int[length + 1];
        for(int index = 0; index <= length; index++){
            answer[index] = findBlock((int) (begin + index));
        }
        return answer;
    }

    private int findBlock(int number) {

        if(number == 1) {
            return 0;
        }

        for(int divisor = 2; divisor <= (int) Math.sqrt(number); divisor++){
            if(number % divisor == 0 && (number/divisor) <= 10000000){
                return (number/divisor);
            }
        }
        return 1;
    }
}
