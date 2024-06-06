package programmers;

import java.util.Arrays;

public class 거스름돈 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(5, new int[]{1,2,5}));
    }
    static class Solution {
        public int solution(int n, int[] money) {
            Arrays.sort(money);
            int[] dp = new int[n+1];
            dp[0] = 1;
            for(int i = 0; i < money.length; i++){
                for(int j = money[i]; j <= n; j++){
                    dp[j] += dp[j - money[i]] % 1000000007;
                }
            }
            return dp[n];
        }
        }
}