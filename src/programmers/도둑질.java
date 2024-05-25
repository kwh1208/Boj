package programmers;

public class 도둑질 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1000, 1, 0, 1, 2, 1000, 0}));
    }
    static class Solution {
        public int solution(int[] money) {
            int[] dp1 = new int[money.length];
            //첫번째집 털기
            dp1[0] = money[0];
            dp1[1] = Math.max(money[0], money[1]);
            for (int i = 2; i < money.length; i++) {
                dp1[i] = Math.max(dp1[i-1], money[i]+dp1[i-2]);
            }

            //첫번째집 안털기
            int[] dp2 = new int[money.length];
            dp2[0] = 0;
            dp2[1] = money[1];
            for (int i = 2; i < money.length; i++) {
                dp2[i] = Math.max(dp2[i-1], money[i]+dp2[i-2]);
            }


            int max = 0;
            for (int i = 0; i < dp1.length; i++) {
                max = Math.max(Math.max(max, dp1[i]), dp2[i]);
            }
            return max;
        }
    }
}
