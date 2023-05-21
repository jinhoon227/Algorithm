package main.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2134 {

    // 창고이전
    public void solution() {
        int n = 0;
        int m = 0;
        int k = 0;

        int[] nFloor = {};
        int nCount = 0;
        long nCost = 0;
        int[] mFloor = {};
        int mCount = 0;
        long mCost = 0;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            nFloor = new int[n + 1];
            mFloor = new int[m + 1];

            for (int i = 1; i <= n; i++) {
                nFloor[i] = Integer.parseInt(br.readLine());
                nCount += nFloor[i];
                nCost += i * nFloor[i];
            }


            for (int i = 1; i < m; i++) {
                mFloor[i] = Integer.parseInt(br.readLine());
                mCount += mFloor[i];
                mCost += i * mFloor[i];
            }
        } catch (Exception e) {

        }

        int article = Math.min(nCount, mCount);
        long allCost = nCost + mCost;
        long remain = Math.abs(nCount - mCount);

        if (nCount > mCount) {
            for (int i = n; i > 0; i--) {
                if (remain <= nFloor[i]) {
                    allCost -= (remain) * i;
                    break;
                }
                allCost -= nFloor[i] * i;
                remain -= nFloor[i];
            }
        } else {
            for (int i = n; i > 0; i--) {
                if (remain <= mFloor[i]) {
                    allCost -= (remain) * i;
                    break;
                }
                allCost -= mFloor[i] * i;
                remain -= mFloor[i];
            }
        }


        System.out.println(article + " " + allCost);
    }
}


//public class Main {
//    public static void main(String[] args) {
//        new Baekjoon2134().solution();
//    }
//}