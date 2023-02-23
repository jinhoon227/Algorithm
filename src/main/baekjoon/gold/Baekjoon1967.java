package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon1967 {

    // 트리의지름
    int max = 0;
    List<Node>[] tree;
    boolean[] visited;

    public void solution() {
        List<Integer> leafNode = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            int n = Integer.parseInt(br.readLine());
            tree = new ArrayList[n + 1];
            visited = new boolean[n + 1];
            for (int i = 0; i <= n; i++) {
                tree[i] = new ArrayList<>();
            }

            for (int i = 1; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int first = Integer.parseInt(st.nextToken());
                int second = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());
                tree[first].add(new Node(second, cost));
                tree[second].add(new Node(first, cost));
            }

            for (int i = 1; i <= n; i++) {
                if (tree[i].size() == 1) {
                    leafNode.add(i);
                }
            }

        } catch (Exception e) {

        }

        for (int leaf : leafNode) {
            visited[leaf] = true;
            countEdge(leaf, 0);
        }

        System.out.println(max);
    }

    private void countEdge(int start, int count) {

        for (Node node : tree[start]) {
            if (!visited[node.next]) {
                visited[node.next] = true;
                countEdge(node.next, count + node.cost);
                visited[node.next] = false;
            } else {
                max = Math.max(max, count);
            }
        }
    }
}

class Node {

    int next;
    int cost;

    public Node(int next, int cost) {
        this.next = next;
        this.cost = cost;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1967().solution();
//    }
//}
