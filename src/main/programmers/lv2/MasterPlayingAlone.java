package main.programmers.lv2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MasterPlayingAlone {

    public int solution(int[] cards) {
        Boolean[] isUsed = new Boolean[cards.length];
        Arrays.fill(isUsed, false);
        List<Integer> gameCards = IntStream.of(cards).boxed().collect(Collectors.toList());

        return gameCards.stream()
                .map(card -> playGame(cards, card, isUsed))
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .reduce((a, b) -> a * b)
                .orElse(0);
    }

    public int playGame(int[] cards, int card, Boolean[] isUsed){
        int count = 0;
        while(!isUsed[card - 1]){
            count++;
            isUsed[card - 1] = true;
            card = cards[card - 1];
        }
        return count;
    }
}
