package main.programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class CrossingBridgeTruck {

    // 다리를 건너는 트럭
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        Queue<Integer> waitingTrucks = new LinkedList<>();
        for(int truckWeight : truck_weights) {
            waitingTrucks.offer(truckWeight);
        }
        Queue<Integer> trucks = new LinkedList<>();

        int amount = 0;
        while(!waitingTrucks.isEmpty()) {
            time++;
            if((amount + waitingTrucks.peek()) <= weight) {
                amount += waitingTrucks.peek();
                trucks.offer(waitingTrucks.poll());
            } else {
                trucks.offer(0);
            }

            if(trucks.size() == bridge_length) {
                amount -= trucks.poll();
            }
        }

        return time + bridge_length;
    }
}
