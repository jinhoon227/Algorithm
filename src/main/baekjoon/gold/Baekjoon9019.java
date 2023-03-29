package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon9019 {

    // DSLR
    public void solution() {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());

            while (T-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());

                sb.append(bfs(from, to)).append(System.getProperty("line.separator"));
            }
        } catch (Exception e) {

        }
        System.out.println(sb);
    }

    private String bfs(int start, int to) {
        Queue<Record> q = new LinkedList<>();
        boolean[] visited = new boolean[10000];
        q.offer(new Record(start, ""));
        visited[start] = true;


        while (!q.isEmpty()) {
            Record cur = q.poll();
            if (cur.num == to) {
                return cur.command;
            }

            int next;
            if (cur.num * 2 > 9999) {
                next = (cur.num * 2) % 10000;
            } else {
                next = cur.num * 2;
            }
            if (!visited[next]) {
                visited[next] = true;
                q.offer(new Record(next, cur.command + "D"));
            }

            if (cur.num == 0) {
                next = 9999;
            } else {
                next = cur.num - 1;
            }
            if (!visited[next]) {
                visited[next] = true;
                q.offer(new Record(next, cur.command + "S"));
            }

            int leftNum = cur.num / 1000;
            next = (cur.num % 1000) * 10 + leftNum;
            if (!visited[next]) {
                visited[next] = true;
                q.offer(new Record(next, cur.command + "L"));
            }

            int rightNum = cur.num % 10;
            next = (cur.num / 10) + 1000 * rightNum;
            if (!visited[next]) {
                visited[next] = true;
                q.offer(new Record(next, cur.command + "R"));
            }
        }

        return "ERROR";
    }

    class Record {
        int num;
        String command;

        public Record(int num, String command) {
            this.num = num;
            this.command = command;
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon9019().solution();
//    }
//}