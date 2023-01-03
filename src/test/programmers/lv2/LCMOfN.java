package programmers.lv2;

public class LCMOfN {

    // N 개의 최소공배수
    public int solution(int[] arr) {
        return getLCM(arr);
    }

    private int getLCM(int[] numbers) {
        if(numbers.length == 1){
            return numbers[0];
        }

        int gcd = getGCD(numbers[0], numbers[1]);
        int lcm = (numbers[0] * numbers[1]) / gcd;

        for(int index = 2; index < numbers.length; index++) {
            gcd = getGCD(lcm, numbers[index]);
            lcm = (lcm * numbers[index]) / gcd;
        }

        return lcm;
    }

    private int getGCD(int number1, int number2) {
        if(number1 % number2 == 0) {
            return number2;
        }
        return getGCD(number2, number1 % number2);
    }
}
