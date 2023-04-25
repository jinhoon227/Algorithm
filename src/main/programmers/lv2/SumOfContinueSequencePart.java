package main.programmers.lv2;

public class SumOfContinueSequencePart {

    // 연속된 부분 수열의 합
    public int[] solution(int[] sequence, int k) {
        int lastStart = -1;
        int lastEnd = -1;
        int start = 0;
        int end = start;
        int length = Integer.MAX_VALUE;
        int sum = sequence[start];
        while (end != sequence.length) {

            if (sum <= k) {
                if (sum == k && end - start < length) {
                    length = end - start;
                    lastStart = start;
                    lastEnd = end;
                }
                end++;
                if (end < sequence.length) {
                    sum += sequence[end];
                }
            } else {
                sum -= sequence[start];
                start++;
            }
        }

        return new int[]{lastStart, lastEnd};
    }
}
