package main.programmers;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivideNumberCard {
    public int solution(int[] arrayA, int[] arrayB) {
        return findAnswer(arrayA, arrayB);
    }

    public int findAnswer(int[] arrayA, int[] arrayB) {
        List<Integer> listA = IntStream.of(arrayA).boxed().collect(Collectors.toList());
        List<Integer> listB = IntStream.of(arrayB).boxed().collect(Collectors.toList());

        Set<Integer> dividePossibleNumbers = collectDivideNumbersByMin(listA);
        dividePossibleNumbers.addAll(collectDivideNumbersByMin(listB));

        return Math.max(findGameNumber(listA, listB, dividePossibleNumbers),
                findGameNumber(listB, listA, dividePossibleNumbers));
    }

    public int findGameNumber(List<Integer> listA, List<Integer> listB, Set<Integer> dividePossibleNumbers) {

        List<Integer> gameNumber = collectGameNumbers(listA, listB, dividePossibleNumbers);
        if (gameNumber.isEmpty()) {
            return 0;
        }
        return Collections.max(gameNumber);
    }

    public List<Integer> collectGameNumbers(List<Integer> divideNumbers,
                                            List<Integer> undividedNumbers,
                                            Set<Integer> dividePossibleNumbers) {
        return dividePossibleNumbers.stream()
                .filter(number -> isGameNumber(divideNumbers, undividedNumbers, number))
                .collect(Collectors.toList());
    }

    public boolean isGameNumber(List<Integer> divideNumbers,
                                List<Integer> undividedNumbers,
                                int dividePossibleNumbers) {
        return (divideNumbers.stream().allMatch(number -> number % dividePossibleNumbers == 0)
                && undividedNumbers.stream().allMatch(number -> number % dividePossibleNumbers != 0));
    }

    public Set<Integer> collectDivideNumbersByMin(List<Integer> numbers){
        int min = Collections.min(numbers);
        return IntStream.rangeClosed(2, min)
                .filter(number -> min % number == 0)
                .boxed()
                .collect(Collectors.toSet());
    }
}
