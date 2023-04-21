package main.programmers.lv2;

import java.util.HashMap;
import java.util.Map;

public class MineMineral {

    // 광물 캐기
    int totalMinerals;
    int totalFatigue = Integer.MAX_VALUE;
    Map<String, Integer> cost = new HashMap<>();

    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int dia = picks[0];
        int iron = picks[1];
        int stone = picks[2];
        int totalPick = dia + iron + stone;
        totalMinerals = Math.min(minerals.length, totalPick * 5);
        cost.put("diadiamond", 1);
        cost.put("diairon", 1);
        cost.put("diastone", 1);
        cost.put("irondiamond", 5);
        cost.put("ironiron", 1);
        cost.put("ironstone", 1);
        cost.put("stonediamond", 25);
        cost.put("stoneiron", 5);
        cost.put("stonestone", 1);

        dfs(dia , iron, stone, "dia", 0, 0,0, minerals);

        return totalFatigue;
    }

    private void dfs(int dia, int iron, int stone, String weapon, int start, int end, int fatigue, String[] minerals) {

        for (int i = start; i < end; i++) {
            fatigue += cost.get(weapon + minerals[i]);
        }

        if (end == totalMinerals) {
            totalFatigue = Math.min(totalFatigue, fatigue);
        }

        int nextEnd = Math.min(end + 5, totalMinerals);

        if (dia > 0) {
            dfs(dia - 1, iron, stone, "dia", end, nextEnd, fatigue, minerals);
        }

        if (iron > 0) {
            dfs(dia, iron - 1, stone, "iron", end, nextEnd, fatigue, minerals);
        }

        if (stone > 0) {
            dfs(dia, iron, stone - 1, "stone", end, nextEnd, fatigue, minerals);
        }

    }
}
