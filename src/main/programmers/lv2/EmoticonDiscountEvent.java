package main.programmers.lv2;

public class EmoticonDiscountEvent {

    // 이모티콘 할인행사
    int[] answer;
    int[] userPerSum;

    public int[] solution(int[][] users, int[] emoticons) {
        answer = new int[]{0, 0};
        userPerSum = new int[users.length];
        findAnswer(users, emoticons, emoticons.length);
        return answer;
    }

    private void findAnswer(int[][] users, int[] emoticons, int n) {
        if (n == 0) {
            int sum = 0;
            int subscriber = 0;
            for (int index = 0; index < users.length; index++) {
                if (userPerSum[index] >= users[index][1]) {
                    subscriber++;
                } else {
                    sum += userPerSum[index];
                }
            }

            if (subscriber > answer[0]) {
                answer[0] = subscriber;
                answer[1] = sum;
            } else if (subscriber == answer[0] && sum > answer[1]) {
                answer[1] = sum;
            }

            return;
        }

        for (int discount = 10; discount <= 40; discount += 10) {
            int price = emoticons[emoticons.length - n] * (100 - discount) / 100;
            addPrice(users, price, discount);
            findAnswer(users, emoticons, n - 1);
            addPrice(users, -price, discount);
        }
    }

    private void addPrice(int[][] users, int price, int discount) {
        for (int index = 0; index < users.length; index++) {
            if (users[index][0] <= discount) {
                userPerSum[index] += price;
            }
        }
    }
}
