package programmers;

import java.util.Comparator;
import java.util.PriorityQueue;

public class 이중우선순위큐 {
    class Solution {
        public int[] solution(String[] operations) {
            int[] answer = {};
            PriorityQueue<Integer> min = new PriorityQueue<>();
            PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());

            for (String s : operations) {
                if (s.startsWith("I")){
                    min.add(Integer.parseInt(s.split(" ")[1]));
                    max.add(Integer.parseInt(s.split(" ")[1]));
                }
                else if (s.startsWith("D")){
                    if (max.isEmpty()){
                        continue;
                    }
                    String tmp = s.split(" ")[1];
                    if (tmp.equals("1")){
                        Integer deleteNum = max.poll();
                        min.remove(deleteNum);
                    }
                    else{
                        Integer deleteNum = min.poll();
                        max.add(deleteNum);
                    }
                }
            }

            if (min.isEmpty()){
                return new int[]{0, 0};
            }
            return new int[]{max.poll(), min.poll()};
        }
    }
}
