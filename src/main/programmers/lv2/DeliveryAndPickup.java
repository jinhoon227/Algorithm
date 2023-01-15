package main.programmers.lv2;

import java.util.Stack;

public class DeliveryAndPickup {

    // 택배 배달과 수거하기
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        int deliveryAmount = 0;
        int pickupAmount = 0;
        int DMax = n - 1;
        int PMax = n - 1;

        for (int delivery : deliveries) {
            deliveryAmount += delivery;
        }
        for (int pickup : pickups) {
            pickupAmount += pickup;
        }

        while (DMax != -1 && deliveries[DMax] == 0) {
            DMax--;
        }
        while (PMax != -1 && pickups[PMax] == 0) {
            PMax--;
        }

        while (deliveryAmount != 0 || pickupAmount != 0) {

            while (DMax != -1 && deliveries[DMax] == 0) {
                DMax--;
            }
            while (PMax != -1 && pickups[PMax] == 0) {
                PMax--;
            }

            int DBox = cap;
            int PBox = cap;
            answer += Math.max((DMax + 1) * 2, (PMax + 1) * 2);

            while (DBox > 0 && DMax >= 0) {
                if (deliveries[DMax] <= DBox) {
                    DBox -= deliveries[DMax];
                    deliveries[DMax] = 0;
                    DMax--;
                } else {
                    deliveries[DMax] -= DBox;
                    DBox = 0;
                }
            }

            while (PBox > 0 && PMax >= 0) {
                if (pickups[PMax] <= PBox) {
                    PBox -= pickups[PMax];
                    pickups[PMax] = 0;
                    PMax--;
                } else {
                    pickups[PMax] -= PBox;
                    PBox = 0;
                }
            }

            deliveryAmount -= (cap - DBox);
            pickupAmount -= (cap - PBox);
        }
        return answer;
    }
}
