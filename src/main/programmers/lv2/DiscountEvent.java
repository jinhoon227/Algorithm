package main.programmers.lv2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DiscountEvent {

    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> discounts = startDiscounts(discount);
        Map<String, Integer> wants = makeWantMap(want, number);

        int answer = 0;
        for (int i = 10; i < discount.length; i++) {
            answer = checkAnswer(wants, discounts, answer);
            discounts.put(discount[i - 10], discounts.get(discount[i - 10]) - 1);
            discounts.put(discount[i], discounts.getOrDefault(discount[i], 0) + 1);
        }
        answer = checkAnswer(wants, discounts, answer);
        return answer;
    }

    public int checkAnswer(Map<String, Integer> wants, Map<String, Integer> discounts, int count) {
        if (wants.keySet()
                .stream()
                .allMatch(item -> (discounts.get(item) == wants.get(item)))) {
            return ++count;
        }
        return count;
    }

    public Map<String, Integer> startDiscounts(String[] discount) {
        Map<String, Integer> initialDiscounts = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            initialDiscounts.put(discount[i], initialDiscounts.getOrDefault(discount[i], 0) + 1);
        }
        return initialDiscounts;
    }

    public Map<String, Integer> makeWantMap(String[] want, int[] number) {
        Map<String, Integer> initialWant = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            initialWant.put(want[i], number[i]);
        }
        return initialWant;
    }
}
