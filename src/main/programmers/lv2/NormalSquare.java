package main.programmers.lv2;

public class NormalSquare {

    // 멀쩡한 사각형
    public long solution(int w, int h) {
        long baseSquare = (long) w * h;
        int gcd = GCD(w, h);
        return baseSquare - ((long) ((w / gcd) + (h / gcd) - 1) * gcd);
    }

    int GCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return GCD(b, a % b);
    }
}
