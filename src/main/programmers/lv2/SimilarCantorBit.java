package main.programmers.lv2;

public class SimilarCantorBit {

    // 유사 칸토어 비트열
    public int solution(int n, long l, long r) {
        return (int) (countBit(n, r) - countBit(n, l - 1));
    }

    private long countBit(int n, long until) {
        long count = 0;
        while (n != 0) {
            long position = (long) (until / (Math.pow(5, n - 1)));
            count += position * (Math.pow(4, n - 1));

            if (position >= 3) {
                count -= (Math.pow(4, n - 1));
            }

            if (position == 2) {
                return count;
            }

            until = (long) (until % (Math.pow(5, n - 1)));
            n--;
        }
        return count;
    }
}
