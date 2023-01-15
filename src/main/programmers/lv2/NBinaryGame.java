package main.programmers.lv2;

public class NBinaryGame {

    // N진수 게임
    public String solution(int n, int t, int m, int p) {

        StringBuilder answer = new StringBuilder();
        StringBuilder binaryNumbers = new StringBuilder();

        int next = p - 1;
        int number = 0;
        while (answer.length() != t) {
            while (binaryNumbers.length() <= next) {
                binaryNumbers.append(Integer.toString(number, n));
                number++;
            }
            answer.append(binaryNumbers.charAt(next));
            next += m;
        }
        return answer.toString().toUpperCase();
    }
}
