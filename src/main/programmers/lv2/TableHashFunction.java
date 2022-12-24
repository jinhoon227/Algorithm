package main.programmers.lv2;

import java.util.ArrayList;
import java.util.Arrays;

public class TableHashFunction {

    // 테이블 해쉬 함수
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int[][] sortedData = sortData(data, col);
        ArrayList<Integer> operatedModuloData = operateModulo(sortedData, row_begin, row_end);
        return operateXOR(operatedModuloData);
    }

    private int operateXOR(ArrayList<Integer> operatedModuloData) {
        return operatedModuloData.stream()
                .reduce((data1, data2) -> (data1 ^ data2)).orElse(-1);
    }

    private ArrayList<Integer> operateModulo(int[][] originData, int row_begin, int row_end) {
        ArrayList<Integer> data = new ArrayList<>();
        for (int y = row_begin - 1; y < row_end; y++) {
            int sum = 0;
            for (int x = 0; x < originData[0].length; x++) {
                sum += (originData[y][x] % (y + 1));
            }
            data.add(sum);
        }
        return data;
    }

    private int[][] sortData(int[][] originData, int col) {
        int[][] data = originData.clone();
        Arrays.sort(data, (o1, o2) -> {
            if (o1[col - 1] == o2[col - 1]) {
                return o2[0] - o1[0];
            }
            return o1[col - 1] - o2[col - 1];
        });

        return data;
    }
}
