package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon2002 {

    // 추월
    public void solution() {
        int count = 0;
        int N = 0;
        int[] outCars = {};
        Map<String, Integer> cars = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                cars.put(br.readLine(), i);
            }

            outCars = new int[N];
            for (int i = 0; i < N; i++) {
                outCars[i] = cars.get(br.readLine());
            }

        } catch (Exception e) {

        }

        int min = outCars[N-1];
        for (int i = N - 2; i >=0; i--) {
            if (min < outCars[i]) {
                count++;
            } else {
                min = outCars[i];
            }
        }
        System.out.println(count);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2002().solution();
//    }
//}