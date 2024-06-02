package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 단어퍼즐 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new String[]{"ab", "na", "n", "a", "bn"}, "nabnabn"));;
    }
    static class Solution {
        public int solution(String[] strs, String t) {
            int answer = 0;
            int[] dp = new int[t.length() + 1];
            Arrays.fill(dp, 1000000);
            ArrayList<String> letter = new ArrayList<>();
            for (String str : strs) {
                letter.add(str);
            }
            dp[0] = 0;
            for (int i = 1; i <= t.length(); i++) {
                for (int j = 1; j <= 5; j++) {
                    if (i - j >= 0) {
                        String tmp = t.substring(i - j, i);
                        if (letter.contains(tmp)) {
                            dp[i] = Math.min(dp[i], dp[i - j] + 1);
                        }
                    }
                }
            }

            if (dp[t.length()] == 1000000) {
                return -1;
            }
            return dp[t.length()];
        }
    }
}
