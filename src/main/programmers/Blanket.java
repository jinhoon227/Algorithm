package main.programmers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Blanket {
    // 카펫
    public int[] solution(int brown, int yellow) {
        List<Integer> possibleNumber = makePossibleNumber(yellow);
        int d = 3;
        return possibleNumber.stream()
                .filter(number -> findSize(number, yellow, brown))
                .findFirst()
                .map(number -> convertArray(number, yellow))
                .orElse(new int[]{-1});
    }

    private int[] convertArray(int number, int yellow) {
        return new int[]{(yellow / number) + 2, number + 2};
    }

    private boolean findSize(int height, int yellow, int brown) {
        int width = yellow / height;
        return (brown == (2 * (height + width) + 4));
    }

    private List<Integer> makePossibleNumber(int yellow) {
        return IntStream.rangeClosed(1, (yellow / 2) + 1)
                .filter(number -> (yellow % number == 0))
                .boxed()
                .collect(Collectors.toList());
    }
}
