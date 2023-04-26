package main.programmers.lv2;

public class IntegerPairOfTwoCircle {

    // 두 원 사이의 정수 쌍
    public long solution(int r1, int r2) {
        long answer = 0;

        for (long i = 0; i < r2; i++) {

            long y1 = (long) Math.sqrt((long) r1 * r1 - i * i);
            long y2 = (long) Math.sqrt((long) r2 * r2 - i * i);

            answer += (y2 - y1) * 4;
        }


        for (long i = 1; i < r1; i++) {
            if(Math.sqrt((long) r1 * r1 - i * i)%1==0){
                answer += 4;
            }
        }

        return answer + 4;
    }
}
