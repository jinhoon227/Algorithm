package main.programmers.lv2;

public class MultiOfArray {

    // 행렬의 곱셈
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int height = 0; height < arr1.length; height++){
            for(int width = 0; width < arr2[0].length; width++){
                int sum = 0;
                for(int arr1Width = 0; arr1Width < arr1[height].length; arr1Width++){
                    sum += arr1[height][arr1Width] * arr2[arr1Width][width];
                }
                answer[height][width] = sum;
            }
        }
        return answer;
    }
}
