package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon2406 {

    // 안정적인 네트워크
    static int[] mst;

    public static void main(String[] args) throws IOException {

        int n, m;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(ints -> ints[2]));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        mst = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            mst[i] = i;
        }

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            union(first, second);
        }

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                int weight = Integer.parseInt(st.nextToken());
                if (i == j || i == 1 || j == 1) {
                    continue;
                }

                pq.add(new int[]{i, j, weight});
            }
        }

        int count = 0;
        int sum = 0;
        List<int[]> connect = new ArrayList<>();
        while (!pq.isEmpty()) {
            int cur[] = pq.poll();
            if (find(cur[0]) != find(cur[1])) {
                sum += cur[2];
                count++;
                union(cur[0], cur[1]);
                connect.add(new int[]{cur[0], cur[1]});
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum)
                .append(" ")
                .append(count)
                .append(System.getProperty("line.separator"));

        for (int[] line : connect) {
            sb.append(line[0])
                    .append(" ")
                    .append(line[1])
                    .append(System.getProperty("line.separator"));
        }

        System.out.println(sb.toString());
    }

    private static int find(int x) {

        if (mst[x] == x) {
            return x;
        }

        return find(mst[x]);
    }

    private static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x != y) {
            if (x < y) {
                mst[y] = x;
            } else {
                mst[x] = y;
            }
        }
    }
}
