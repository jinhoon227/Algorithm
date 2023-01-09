package main.programmers.lv2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Cash {
    // 캐시
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> order = new LinkedList<>();
        Set<String> existCash = new HashSet<>();

        for(String city : cities) {
            city = city.toLowerCase();
            if(existCash.add(city)) {
                answer += 5;
                order.add(city);
                if(order.size() > cacheSize) {
                    existCash.remove(order.remove(0));
                }
            } else {
                answer++;
                order.remove(city);
                order.add(city);
            }
        }

        return answer;
    }
}
