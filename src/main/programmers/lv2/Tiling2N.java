package main.programmers.lv2;

public class Tiling2N {

    // 2N 타일링
    public int solution(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int index = 3; index <= n; index++) {
            dp[index] = (dp[index - 1] + dp[index - 2]) % 1_000_000_007;
        }
        return dp[n];
    }
}
