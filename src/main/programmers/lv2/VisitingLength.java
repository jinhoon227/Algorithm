package main.programmers.lv2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class VisitingLength {

    // 방문길이
    public int solution(String dirs) {
        Set<Location> visited = new HashSet<>();

        Location current = new Location(0, 0);

        for (int command = 0; command < dirs.length(); command++) {
            if (dirs.charAt(command) == 'U') {
                if (isMove(current.x, current.y + 1)) {
                    visited.add(new Location(current.x, (float) (current.y + 0.5)));
                    current.move(0, 1);
                }
            }

            if (dirs.charAt(command) == 'D') {
                if (isMove(current.x, current.y - 1)) {
                    visited.add(new Location(current.x, (float) (current.y - 0.5)));
                    current.move(0, -1);
                }
            }

            if (dirs.charAt(command) == 'R') {
                if (isMove(current.x + 1, current.y)) {
                    visited.add(new Location((float) (current.x + 0.5), current.y));
                    current.move(1, 0);
                }
            }

            if (dirs.charAt(command) == 'L') {
                if (isMove(current.x - 1, current.y)) {
                    visited.add(new Location((float) (current.x - 0.5), current.y));
                    current.move(-1, 0);
                }
            }
        }
        return visited.size();
    }

    private boolean isMove(float x, float y) {
        return x <= 5 && x >= -5 && y <= 5 && y >= -5;
    }

    class Location {
        float x;
        float y;

        public Location(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public void move(float x, float y) {
            this.x += x;
            this.y += y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Location location = (Location) o;
            return x == location.x && y == location.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
