package main.programmers;

import java.util.*;
import java.util.stream.Collectors;

public class SelectTangerine {

    public int solution(int k, int[] tangerine) {

        /**
         * 메모, collect(Collectors.groupingBy) 를 활용해보자!
         * Map<Integer, Long> collect = Arrays.stream(tangerine)
         *                                            .boxed()
         *                                            .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
         */
        List<Integer> ascendingClassifiedTangerine = classifyTangerine(tangerine).entrySet()
                .stream()
                .sorted(Comparator.comparingInt((Map.Entry<Integer, Integer> value) -> -value.getValue()))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        return countTangerine(k, ascendingClassifiedTangerine);
    }

    public int countTangerine(int k, List<Integer> ascendingClassifiedTangerine){
        int count = 0;
        for(int classifiedTangerine : ascendingClassifiedTangerine){
            k -= classifiedTangerine;
            count++;
            if(k <= 0){
                return count;
            }
        }
        return count;
    }

    public HashMap<Integer, Integer> classifyTangerine(int[] tangerine){
        HashMap<Integer, Integer> classifiedTangerine = new HashMap<>();
        for(int unitTangerine : tangerine){
            classifiedTangerine.put(unitTangerine, classifiedTangerine.getOrDefault(unitTangerine, 0) + 1 );
        }
        return classifiedTangerine;
    }
}
