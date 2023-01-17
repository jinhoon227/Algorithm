package main.programmers.lv2;

public class Tiling3N {

    // 3N 타일링
    public int solution(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 0;
        dp[2] = 3;
        dp[3] = 3;
        dp[4] = 11;
        long sum = 2;
        for (int main = 5; main <= n; main++) {
            if (main % 2 == 0) {
                sum = sum + dp[main - 4] * 2L;
                dp[main] = (int) ((sum + dp[main - 2] * 3L) % 1_000_000_007);
            } else {
                dp[main] = dp[main - 1];
            }
        }
        return dp[n];
    }
}
