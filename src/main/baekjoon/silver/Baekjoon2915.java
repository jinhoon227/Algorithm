package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon2915 {

    // 로마 숫자 재배치
    String loma;
    boolean[] visited;
    String answer;
    String[] oneUnit = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    String[] tenUnit = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    Map<String, Integer> lomaNumbers = new HashMap<>();
    public void solution() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            loma = br.readLine();
            visited = new boolean[loma.length()];
        } catch (Exception e) {

        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                lomaNumbers.put(tenUnit[i] + oneUnit[j], 10 * (i + 1) + j + 1);
            }
        }

        for (int i = 0; i < 9; i++) {
            lomaNumbers.put(oneUnit[i], i + 1);
        }

        for (int i = 0; i < 9; i++) {
            lomaNumbers.put(tenUnit[i], 10 * (i + 1));
        }

        answer = loma;
        dfs(0, loma.length(), "");

        System.out.println(answer);
    }
    private void dfs(int start, int length, String number) {
        if (start == length) {
            answer = getBigLomaNumber(answer, number);
            return;
        }

        for (int i = 0; i < length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(start + 1, length, number + loma.charAt(i));
                visited[i] = false;
            }
        }
    }

    private String getBigLomaNumber(String answer, String number) {
        if (lomaNumbers.get(answer) <= lomaNumbers.getOrDefault(number, lomaNumbers.get(answer))) {
            return answer;
        }
        return number;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2915().solution();
//    }
//}