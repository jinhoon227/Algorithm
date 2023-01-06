package main.programmers.lv2;

public class JumpAndTeleport {

    // 점프와 순간이동
    public int solution(int n) {
        int answer = 1;
        while(n != 1) {
            if(n % 2 != 0) {
                answer++;
                n -= 1;
            }
            n /= 2;
        }

        return answer;
    }
}
