package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Baekjoon11651 {

    // 좌표 정렬하기 2
    public void solution() {
        Location[] locations = {};
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            int N = Integer.parseInt(br.readLine());
            locations = new Location[N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                locations[i] = new Location(Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken()));
            }
        } catch (Exception e) {
        }

        Arrays.sort(locations);

        StringBuilder sb = new StringBuilder();
        for (Location location : locations) {
            sb.append(location.x)
                    .append(" ")
                    .append(location.y)
                    .append(System.getProperty("line.separator"));
        }
        System.out.println(sb);

    }

    private class Location implements Comparable<Location> {
        int x;
        int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Location o) {
            if (this.y == o.y) {
                return this.x - o.x;
            }
            return this.y - o.y;
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon11651().solution();
//    }
//}