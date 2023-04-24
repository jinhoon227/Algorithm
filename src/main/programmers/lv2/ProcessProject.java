package main.programmers.lv2;

import java.util.*;

public class ProcessProject {

    // 과제 진행하기
    public String[] solution(String[][] plans) {
        List<String> result = new ArrayList<>();
        PriorityQueue<Plan> doPlan = new PriorityQueue<>(Comparator.comparingInt(o -> o.start));

        for (String[] plan : plans) {
            String name = plan[0];
            int start = Integer.parseInt(plan[1].split(":")[0]) * 60 +
                    Integer.parseInt(plan[1].split(":")[1]);
            int time = Integer.parseInt(plan[2]);
            doPlan.offer(new Plan(name, start, time));
        }

        Stack<Plan> stop = new Stack<>();

        Plan cur = doPlan.poll();
        while (!doPlan.isEmpty()) {

            Plan next = doPlan.peek();

            int end = cur.start + cur.time;
            if (end <= next.start) {
                result.add(cur.name);
                if (!stop.isEmpty()) {
                    cur = stop.pop();
                    cur.start = end;
                } else {
                    cur = doPlan.poll();
                }
            } else {
                int play = next.start - cur.start;
                cur.time -= play;
                stop.push(cur);
                cur = doPlan.poll();
            }
        }

        result.add(cur.name);

        while (!stop.isEmpty()) {
            result.add(stop.pop().name);
        }

        return result.toArray(new String[result.size()]);
    }

    class Plan {
        String name;
        int start;
        int time;

        public Plan(String name, int start, int time) {
            this.name = name;
            this.start = start;
            this.time = time;
        }
    }
}
