package main.programmers.lv2;

import java.util.*;

public class CandidateKey {

    // 후보키
    private Set<String> candidateKey;

    public int solution(String[][] relation) {
        candidateKey = new HashSet<>();
        String[][] relationWithColumn = new String[relation.length + 1][relation[0].length];
        String[] initialKey = new String[relationWithColumn.length];

        // 컬럼명을 추가한 새로운 테이블 생성(컬럼명으로 키 중복을 판단하기 위함)
        for (int index = 0; index < relationWithColumn[0].length; index++) {
            relationWithColumn[0][index] = index + "";
        }
        for (int index = 1; index < relationWithColumn.length; index++) {
            relationWithColumn[index] = Arrays.copyOf(relation[index - 1], relation[0].length);
        }

        Arrays.fill(initialKey, "");

        // 컬럼 개수만큼 탐색
        for (int number = 1; number <= relationWithColumn[0].length; number++) {
            countCandidateKey(relationWithColumn, initialKey, number, 0, 0);
        }

        return candidateKey.size();
    }

    private void countCandidateKey(String[][] relation, String[] keys, int depth, int start, int next) {

        // 목표 깊이까지 도달할시 회귀함수 종료
        if (start == depth) {
            Set<String> uniqueness = new HashSet<>();
            if (Arrays.stream(keys).allMatch(uniqueness::add)) {
                candidateKey.add(keys[0]);
            }
            return;
        }

        // 조합을 이용한 회귀함수
        for (int x = next; x < relation[0].length; x++) {

            // 지금까지 저장되어있는 후보키들 탐색
            // 후보키 문자열 및 확인하고하는 문자열을 문자단위로 분해
            // 확인하고자 하는 문자열의 문자내에 후보키 문자열의 모든 문자가 포함이 되지않을시 탐색 진행
            String nextColumn = keys[0] + relation[0][x];
            if (candidateKey.stream().noneMatch(key -> key.codePoints()
                    .allMatch(keyUnit -> nextColumn.codePoints().anyMatch(columnUnit -> columnUnit == keyUnit)))) {
                String[] newKeys = keys.clone();

                for (int y = 0; y < relation.length; y++) {
                    newKeys[y] += relation[y][x];
                }

                countCandidateKey(relation, newKeys, depth, start + 1, x + 1);
            }
        }
    }
}
