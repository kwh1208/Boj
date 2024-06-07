package programmers.JUNE;

import java.util.Collections;
import java.util.PriorityQueue;

public class 야근지수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(4, new int[]{4, 3, 3});
    }
    static class Solution {
        public long solution(int n, int[] works) {
            long answer = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < works.length; i++) {
                pq.add(works[i]);
            }
            for (int i = 0; i < n; i++) {
                int now = pq.poll();
                if (now > 0){
                    pq.add(now-1);
                }
                else pq.add(now);
            }
            for (Integer i : pq) {
                System.out.println("i = " + i);
                answer += (long) Math.pow(i, 2);
            }
            return answer;
        }
    }
}
