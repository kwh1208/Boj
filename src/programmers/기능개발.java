package programmers;

import java.util.HashSet;
import java.util.Set;

public class 기능개발 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
    }
    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            int[] remain = new int[progresses.length];
            int[] day = new int[progresses.length];
            for (int i = 0; i < progresses.length; i++) {
                remain[i] = 100 - progresses[i];
                day[i] = (int) Math.ceil((double)remain[i]/speeds[i]);
            }
            for (int i = 1; i < day.length; i++) {
                if (day[i-1]>day[i]) {
                    day[i] = day[i-1];
                }
            }
            Set<Integer> set = new HashSet<>();
            for (int i : day) {
                set.add(i);
            }
            int[] ans = new int[set.size()];
            ans[0] = 1;
            int index = 0;
            for (int i = 1; i < day.length; i++) {
                if (day[i]==day[i-1]) {
                    ans[index]++;
                }
                else{
                    index++;
                    ans[index]++;
                }
            }
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i]);
            }
            return ans;
        }
    }
}
