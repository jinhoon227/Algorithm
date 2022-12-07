package main.programmers;

import java.util.Stack;

public class ParcelBox {
    // 택배상자
    public int solution(int[] order) {
        Stack<Integer> mainBelt = initMainBelt(order.length);
        Stack<Integer> assistanceBelt = new Stack<>();
        return runBelt(mainBelt, assistanceBelt, order);
    }

    public int runBelt(Stack<Integer> mainBelt, Stack<Integer> assistanceBelt, int[] order) {
        int count = 0;
        for (int number : order) {
            if (!mainBelt.isEmpty() && number == mainBelt.peek()) {
                mainBelt.pop();
                count++;
            } else {
                while (!mainBelt.isEmpty() && mainBelt.peek() < number) {
                    assistanceBelt.push(mainBelt.pop());
                }

                if (!mainBelt.isEmpty() && number == mainBelt.peek()) {
                    mainBelt.pop();
                    count++;
                } else if (!assistanceBelt.isEmpty() && assistanceBelt.peek() == number) {
                    assistanceBelt.pop();
                    count++;
                } else {
                    return count;
                }
            }
        }
        return count;
    }

    public Stack<Integer> initMainBelt(int length) {
        Stack<Integer> mainBelt = new Stack<>();
        for (int box = length; box > 0; box--) {
            mainBelt.push(box);
        }
        return mainBelt;
    }
}
