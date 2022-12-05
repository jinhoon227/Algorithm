package main.programmers;

public class RepeatConvertBinary {
    // 이진 반복 변환하기
    public int[] solution(String s) {
        int removingCount = 0;
        int removedOneCount = 0;
        int length = Integer.MAX_VALUE;
        int preLength;
        while (length > 1){
            preLength = s.length();
            s = removeZero(s);
            removingCount++;
            length = s.length();

            removedOneCount += (preLength - length);
            s = convertBinary(s);
        }
        return new int[]{removingCount, removedOneCount};
    }

    private String removeZero(String binary) {
        return binary.replaceAll("0", "");
    }

    private String convertBinary(String binary) {
        return Integer.toBinaryString(binary.length());
    }
}
