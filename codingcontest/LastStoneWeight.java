package codingcontest;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = { 2, 7, 4, 1, 8, 1 };
        int lasttoneWeight = lastStoneWeight(stones);
        System.out.println("lasttoneWeight: " + lasttoneWeight);
    }

    static public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        System.out.println(stones);
        int i = 0;
        for (int val : stones) {
            pq.add(val);
            System.out.println("pq " + i++ + ":" + pq);
        }

        while (pq.size() > 1) {
            int h1 = pq.poll();
            int h2 = pq.poll();
            if (h1 != h2) {
                pq.add(h1 - h2);
            }
        }

        return pq.size() > 0 ? pq.peek() : 0;
    }
}