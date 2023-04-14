package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Baekjoon11650 {

    // 좌표 정렬하기
    public void solution() {
        Location[] locations = {};
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            int N = Integer.parseInt(br.readLine());
            locations = new Location[N];
            for (int i = 0; i < N; i++) {
                Location loc = new Location();
                st = new StringTokenizer(br.readLine());
                loc.x = Integer.parseInt(st.nextToken());
                loc.y = Integer.parseInt(st.nextToken());
                locations[i] = loc;
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


        @Override
        public int compareTo(Location o) {
            if (o.x == this.x) {
                return this.y - o.y;
            }
            return this.x - o.x;
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon11650().solution();
//    }
//}