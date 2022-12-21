package main.programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class GameMapShortestDistance {

    // 게임 맵 최단거리
    int[] xRoute = {-1, 0, 1, 0};
    int[] yRoute = {0, 1, 0, -1};

    public int solution(int[][] maps) {
        return findShortestDistance(maps);
    }

    private int findShortestDistance(int[][] maps) {
        Queue<Location> player = new LinkedList<>();
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        Location location = new Location();
        int minCount = Integer.MAX_VALUE;

        player.offer(location);

        while (!player.isEmpty()) {
            Location current = player.poll();

            for (int index = 0; index < 4; index++) {
                int nextX = current.x + xRoute[index];
                int nextY = current.y + yRoute[index];

                if (nextX >= 0 && nextX < maps[0].length
                        && nextY >= 0 && nextY < maps.length
                        && !visited[nextY][nextX]
                        && maps[nextY][nextX] == 1) {

                    visited[nextY][nextX] = true;
                    int distance = current.distance + 1;
                    if (nextX == maps[0].length - 1 && nextY == maps.length - 1) {
                        minCount = Math.min(minCount, distance);
                    }

                    player.offer(new Location(nextX, nextY, distance));
                }
            }
        }

        if (minCount == Integer.MAX_VALUE) {
            return -1;
        }
        return minCount;
    }

    class Location {
        int x;
        int y;
        int distance;

        Location() {
            this.x = 0;
            this.y = 0;
            this.distance = 1;
        }

        Location(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
}
