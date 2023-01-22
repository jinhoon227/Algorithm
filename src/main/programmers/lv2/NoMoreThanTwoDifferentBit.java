package main.programmers.lv2;

public class NoMoreThanTwoDifferentBit {

    // 2개 이하로 다른 비트
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        int count = 0;
        for (long bit : numbers) {
            String binaryBit = Long.toBinaryString(bit);
            answer[count] = (long) (bit + Math.pow(2, binaryBit.length() - 1));
            for (int index = binaryBit.length(); index > 1; index--) {
                if (binaryBit.charAt(index - 1) == '0') {
                    answer[count] = (long) (bit + Math.pow(2, binaryBit.length() - index));
                    for (int two = index + 1; two <= binaryBit.length(); two++) {
                        if (binaryBit.charAt(two - 1) == '1') {
                            answer[count] -= (long) Math.pow(2, binaryBit.length() - two);
                            break;
                        }
                    }
                    break;
                }
            }
            count++;
        }
        return answer;
    }
}
