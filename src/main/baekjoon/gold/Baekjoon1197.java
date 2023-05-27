package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

// 최소 스패닝 트리
public class Baekjoon1197 {

    int [] parent;

    static class Node {
        int start;
        int end;
        int cost;

        public Node(int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }
    }
    public void solution() {

        int V = 0;
        int E = 0;
        Queue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.cost));

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());

            parent = new int[V + 1];
            for (int i = 1; i <= V; i++) {
                parent[i] = i;
            }

            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());

                pq.add(new Node(start, end, cost));
            }
        } catch (Exception e) {

        }

        int weight = 0;

        while (!pq.isEmpty()) {
            Node node = pq.poll();

            if (union(node.start, node.end)) {
                weight += node.cost;
            }
        }

        System.out.println(weight);
    }

    private int find(int x) {
        if (x == parent[x]) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    private boolean union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x != y) {
            if (x < y) {
                parent[y] = x;
            } else {
                parent[x] = y;
            }
            return true;
        }
        return false;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1197().solution();
//    }
//}