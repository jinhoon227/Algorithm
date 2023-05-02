package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Baekjoon1744 {

    // 수 묶기
    public void solution() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());
            List<Integer> minusNumber = new ArrayList<>();
            int oneCount = 0;
            List<Integer> plusNumber = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                int number = Integer.parseInt(br.readLine());
                if (number > 1) {
                    plusNumber.add(number);
                } else if (number < 1) {
                    minusNumber.add(number);
                } else {
                    oneCount++;
                }
            }

            plusNumber.sort(Collections.reverseOrder());
            Collections.sort(minusNumber);
            int sum = oneCount;

            for (int i = 1; i < plusNumber.size(); i += 2) {
                sum += (plusNumber.get(i - 1) * plusNumber.get(i));
            }

            if (plusNumber.size() % 2 != 0) {
                sum += plusNumber.get(plusNumber.size() - 1);
            }

            for (int i = 1; i < minusNumber.size(); i += 2) {
                sum += (minusNumber.get(i - 1) * minusNumber.get(i));
            }

            if (minusNumber.size() % 2 != 0) {
                sum += minusNumber.get(minusNumber.size() - 1);
            }

            System.out.println(sum);
        } catch (Exception e) {

        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1744().solution();
//    }
//}