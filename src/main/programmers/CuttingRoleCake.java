package main.programmers;

import java.util.HashMap;
import java.util.Map;

public class CuttingRoleCake {
    // 롤케이크 자르기
    public int solution(int[] topping) {
        return cuttingCake(topping);
    }

    private int cuttingCake(int[] topping) {
        int count = 0;
        Map<Integer, Integer> chulsu = new HashMap<>();
        Map<Integer, Integer> brother = new HashMap<>();

        for (int food : topping) {
            chulsu.put(food, chulsu.getOrDefault(food, 0) + 1);
        }

        for (int food : topping) {
            if (chulsu.get(food) == 1) {
                chulsu.remove(food);
            } else {
                chulsu.put(food, chulsu.get(food) - 1);
            }
            brother.put(food, brother.getOrDefault(food, 0) + 1);

            if (chulsu.size() == brother.size()) {
                count++;
            }
        }
        return count;
    }
}
