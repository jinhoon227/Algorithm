package main.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon1238 {

    // 파티
    int N;
    int M;
    int X;
    public void solution() {
        List<List<House>> road = new ArrayList<>();
        List<List<House>> reverseRoad = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            X = Integer.parseInt(st.nextToken());
            for (int i = 0; i <= N; i++) {
                road.add(new ArrayList<>());
                reverseRoad.add(new ArrayList<>());
            }

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int weight = Integer.parseInt(st.nextToken());

                road.get(start).add(new House(end, weight));
                reverseRoad.get(end).add(new House(start, weight));
            }
        } catch (Exception e) {

        }

        int[] goRoute = dijkstra(road);
        int[] backRoute = dijkstra(reverseRoad);

        int answer = 0;
        for (int i = 1; i <= N; i++) {
            answer = Math.max(answer, goRoute[i] + backRoute[i]);
        }

        System.out.println(answer);
    }

    private int[] dijkstra(List<List<House>> road) {
        PriorityQueue<House> pq = new PriorityQueue<>();
        pq.offer(new House(X, 0));

        boolean[] visited = new boolean[N + 1];
        int[] costs = new int[N + 1];
        Arrays.fill(costs, Integer.MAX_VALUE);
        costs[X] = 0;

        while (!pq.isEmpty()) {
            int next = pq.poll().location;

            if (!visited[next]) {
                visited[next] = true;

                for (House house : road.get(next)) {
                    if (!visited[house.location] && costs[house.location] > costs[next] + house.weight) {
                        costs[house.location] = costs[next] + house.weight;
                        pq.add(new House(house.location, costs[house.location]));
                    }
                }
            }
        }

        return costs;
    }
}

class House implements Comparable<House>{

    int location;
    int weight;

    public House(int location, int weight) {
        this.location = location;
        this.weight = weight;
    }

    @Override
    public int compareTo(House o) {
        return weight - o.weight;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon1238().solution();
//    }
//}