package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Baekjoon16202 {

    // MST게임
    static int[] parent;

    public static void main(String[] args) throws IOException {

        int N, M, K;
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            Edge edge = new Edge(from, to, i + 1);
            pq.offer(edge);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < K; i++) {
            PriorityQueue<Edge> mst = new PriorityQueue<>(pq);

            initialParent(N);
            int total = 0;
            while (!mst.isEmpty()) {
                Edge cur = mst.poll();
                if (isUnion(cur.from, cur.to)) {
                    total += cur.weight;
                }

            }

            if (isMST()) {
                result.append(total).append(" ");
            } else {
                result.append(0).append(" ");
            }

            pq.poll();
        }

        System.out.println(result);
    }


    private static boolean isMST() {
        for (int i = 1; i < parent.length; i++) {
            if (find(i) != 1) {
                return false;
            }
        }
        return true;
    }

    private static void initialParent(int n) {
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
    }

    private static boolean isUnion(int x, int y) {
        x = find(x);
        y = find(y);

        if (x != y) {
            if (x > y) {
                parent[x] = y;
            } else {
                parent[y] = x;
            }
            return true;
        }
        return false;
    }

    private static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    static class Edge {
        int from;
        int to;
        int weight;

        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
    }
}

