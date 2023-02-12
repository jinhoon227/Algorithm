package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Baekjoon1525 {

    // 퍼즐
    int[] moveX = {-1, 1, 0, 0};
    int[] moveY = {0, 0, -1, 1};

    String table = "";
    String answer = "123456780";
    HashMap<String, Integer> visited = new HashMap<>();

    public void solution() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            for (int row = 0; row < 3; row++) {
                st = new StringTokenizer(br.readLine());
                for (int col = 0; col < 3; col++) {
                    table += st.nextToken();
                }
            }
        } catch (Exception e) {

        }

        countMoving();
        System.out.println(visited.getOrDefault(answer, 0) - 1);
    }

    private void countMoving() {

        Queue<String> q = new LinkedList<>();
        q.add(table);
        visited.put(table, 1);

        while (!q.isEmpty()) {
            String currentTable = q.poll();
            int zeroIndex = currentTable.indexOf('0');
            int px = zeroIndex % 3;
            int py = zeroIndex / 3;

            for (int i = 0; i < 4; i++) {
                int mx = px + moveX[i];
                int my = py + moveY[i];

                if (mx > 2 || mx < 0 || my > 2 || my < 0) {
                    continue;
                }

                int moveIndex = 3 * my + mx;
                char c = currentTable.charAt(moveIndex);

                String nextTable = currentTable.replace(c, 'T');
                nextTable = nextTable.replace('0', c);
                nextTable = nextTable.replace('T', '0');

                if (!visited.containsKey(nextTable)) {
                    visited.put(nextTable, visited.get(currentTable) + 1);
                    q.add(nextTable);
                }
            }
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1525().solution();
//    }
//}