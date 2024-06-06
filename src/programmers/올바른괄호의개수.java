package programmers;


public class 올바른괄호의개수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(14));
    }
    static class Solution {
        public int solution(int n) {
            int[] dp = new int[n + 2];
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i <= n+1; i++) {
                for (int j = 0; j < i; j++) {
                    dp[i] += dp[j] * dp[i - j];
                }
            }
            return dp[n+1];
        }
    }
}