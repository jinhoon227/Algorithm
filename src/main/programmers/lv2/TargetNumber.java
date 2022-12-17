package main.programmers.lv2;

public class TargetNumber {

    // 타겟 번호
    private int answer;

    public int solution(int[] numbers, int target) {
        answer = 0;
        countAnswer(numbers, target, -1, 0);
        return answer;
    }

    private void countAnswer(int[] numbers, int target, int position, int sum) {

        if (position == numbers.length - 1) {
            if (sum == target) {
                answer++;
            }
            return;
        }

        position++;
        countAnswer(numbers, target, position, sum + numbers[position]);
        countAnswer(numbers, target, position, sum - numbers[position]);
    }
}
