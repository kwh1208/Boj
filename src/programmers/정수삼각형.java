package programmers;

public class 정수삼각형 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}));
    }
    static class Solution {
        public int solution(int[][] triangle) {
            int[][] dp = new int[triangle.length][triangle[triangle.length-1].length];
            dp[0][0] = triangle[0][0];
            for (int i = 1; i < triangle.length; i++) {
                for (int j = 0; j < triangle[i].length; j++) {
                    if (j!=0){
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]) + triangle[i][j];
                    }
                    else{
                        dp[i][j] = dp[i-1][j]+triangle[i][j];
                    }
                }
            }
            int answer = 0;
            for (int i = 0; i < triangle.length; i++) {
                answer = Math.max(answer, dp[triangle.length-1][i]);
            }
            return answer;
        }
    }
}
