package main.programmers.lv2;

public class RentHotel {

    // 호텔 대실
    public int solution(String[][] book_time) {
        int answer = 0;
        int[] time = new int[60 * 24 + 10];

        for (String[] bk : book_time) {
            String[] start_time = bk[0].split(":");
            int start = Integer.parseInt(start_time[0]) * 60 + Integer.parseInt(start_time[1]);
            String[] end_time = bk[1].split(":");
            int end = Integer.parseInt(end_time[0]) * 60 + Integer.parseInt(end_time[1]) + 9;

            for (int i = start; i <= end; i++) {
                time[i]++;
            }
        }

        for (int i = 1; i <= 60 * 24 + 9; i++) {
            answer = Math.max(answer, time[i]);
        }

        return answer;
    }
}
