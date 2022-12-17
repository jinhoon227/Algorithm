package main.programmers.lv1;

public class Trio {
    // 삼총사
    public int solution(int[] number) {
        int answer = 0;
        int length = number.length;
        for (int one = 0; one < length; one++) {
            for (int two = one + 1; two < length; two++) {
                for (int three = two + 1; three < length; three++) {
                    if (number[one] + number[two] + number[three] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
