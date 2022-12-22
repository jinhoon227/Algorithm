package main.programmers.lv2;

import java.util.*;

public class SearchRanking {

    // 순위 검색
    // 바이너리 서치 이용
    private Map<String, ArrayList<Integer>> userScore;

    public int[] solution(String[] info, String[] queries) {
        userScore = new HashMap<>();
        makeUserScore(info);
        sortScore();
        return executeQueries(queries);
    }

    private void sortScore() {
        userScore.values().forEach(Collections::sort);
    }

    private int[] executeQueries(String[] queries) {
        int[] answer = new int[queries.length];
        for (int index = 0; index < queries.length; index++) {
            answer[index] = executeQuery(queries[index].replaceAll(" and ", "").split(" "));
        }
        return answer;
    }

    private int executeQuery(String[] query) {
        int count = 0;
        ArrayList<Integer> scores = userScore.get(query[0]);
        if (scores == null) {
            return count;
        }

        int start = 0;
        int end = scores.size() - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (Integer.parseInt(query[1]) > scores.get(mid)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return scores.size() - start;
    }

    private void makeUserScore(String[] info) {
        for (String application : info) {
            combineInfo(application.split(" "), 0, "");
        }
    }

    private void combineInfo(String[] application, int index, String key) {
        if (index == 4) {
            ArrayList<Integer> score = userScore.getOrDefault(key, new ArrayList<>());
            score.add(Integer.parseInt(application[index]));
            userScore.put(key, score);
            return;
        }

        combineInfo(application, index + 1, key + "-");
        combineInfo(application, index + 1, key + application[index]);
    }
}
