package main.programmers.lv2;

import java.util.Arrays;

public class Hopscotch {

    // 땅따먹기
    int solution(int[][] land) {

        for(int height = 1; height < land.length; height++) {
            land[height][0] += Math.max(land[height-1][1], Math.max(land[height-1][2], land[height-1][3]));
            land[height][1] += Math.max(land[height-1][0], Math.max(land[height-1][2], land[height-1][3]));
            land[height][2] += Math.max(land[height-1][0], Math.max(land[height-1][1], land[height-1][3]));
            land[height][3] += Math.max(land[height-1][0], Math.max(land[height-1][1], land[height-1][2]));
        }

        return Math.max(Math.max(land[land.length-1][0], land[land.length-1][1]),
                Math.max(land[land.length-1][2], land[land.length-1][3]));
    }
}
