package programmers;

import java.util.HashMap;
import java.util.HashSet;

public class 추석트래픽 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new String[]{"2016-09-15 20:59:57.421 0.351s",
                "2016-09-15 20:59:58.233 1.181s",
                "2016-09-15 20:59:58.299 0.8s",
                "2016-09-15 20:59:58.688 1.041s",
                "2016-09-15 20:59:59.591 1.412s",
                "2016-09-15 21:00:00.464 1.466s",
                "2016-09-15 21:00:00.741 1.581s",
                "2016-09-15 21:00:00.748 2.31s",
                "2016-09-15 21:00:00.966 0.381s",
                "2016-09-15 21:00:02.066 2.62s"}));
    }
    static class Solution {
        public int solution(String[] lines) {
            int max= 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (String line : lines) {
                String[] split = line.split(" ");
                int startTime = 0;
                startTime = Integer.parseInt(split[1].substring(0, 2))*3600*1000
                + Integer.parseInt(split[1].substring(3, 5))*60*1000
                + Integer.parseInt(split[1].substring(6, 8))*1000
                + Integer.parseInt(split[1].substring(9));

                int continueTime = Integer.parseInt(split[2].replace("s", "").replace(".", ""));
                if (continueTime<10){
                    continueTime*=1000;
                } else if (continueTime < 100) {
                    continueTime*=100;
                }
                else{
                    continueTime*=10;
                }
                for (int i = 1; i < continueTime; i++) {
                    if (map.containsKey(startTime)) {
                        map.put(startTime, map.get(startTime)+1);
                    }
                    else {
                        map.put(startTime, 1);
                    }
                    startTime--;
                }
            }
            for (Integer i : map.keySet()) {
                if (map.get(i) > max) {
                    System.out.println(i);
                    max = map.get(i);
                }
            }

            return max;
        }
    }
}