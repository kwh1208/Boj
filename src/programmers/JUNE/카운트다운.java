package programmers.JUNE;

public class 카운트다운 {
    class Solution {
        public int[] solution(int target) {
            int[] answer = {};
            int[][] dp = new int[target + 1][2];
            int[] single = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
            int[] dou = new int[21];
            int[] tri = new int[21];
            for (int i : single) {
                dou[i] = 2*i;
                tri[i] = 3*i;
            }
            for (int i = 1; i <= 20; i++) {
                if (i <= target) {
                    dp[i][0] = 1;
                    dp[i][1] = 1;
                }
                if (2 * i <= target) {
                    dp[2 * i][0] = 1;
                    dp[2 * i][1] = 0;
                }
                if (3 * i <= target) {
                    dp[3 * i][0] = 1;
                    dp[3 * i][1] = 0;
                }
            }
            if (50 <= target) {
                dp[50][0] = 1;
                dp[50][1] = 1;
            }

            for (int i = 21; i <= target; i++) {
                if(dp[i][0] == 0)
                    dp[i][0] = Integer.MAX_VALUE;
                for (int j = 1; j <= 20; j++) {
                    //싱글 먼저
                    if (dp[i][0]>dp[i-j][0]+1){
                        dp[i][0] = dp[i-j][0]+1;
                        dp[i][1] = dp[i-j][1]+1;
                    }
                    else if (dp[i][0]==dp[i-j][0]+1){
                        if (dp[i][1]<dp[i-j][1]+1){
                            dp[i][0] = dp[i-j][0]+1;
                            dp[i][1] = dp[i-j][1]+1;
                        }
                    }

                    //더블
                    if(i-2*j>0){
                        if (dp[i][0]>dp[i-2*j][0]+1){
                            dp[i][0] = dp[i-2*j][0]+1;
                            dp[i][1] = dp[i - 2 * j][1];
                        }
                    }
                    if(i-3*j>0){
                        if (dp[i][0]>dp[i-3*j][0]+1){
                            dp[i][0] = dp[i-3*j][0]+1;
                            dp[i][1] = dp[i - 3 * j][1];
                        }
                    }

                }
                if (i>50){
                    if (dp[i][0]>dp[i-50][0]+1){
                        dp[i][0] = dp[i-50][0]+1;
                        dp[i][1] = dp[i-50][1]+1;
                    }
                    else if (dp[i][0]==dp[i-50][0]+1){
                        if (dp[i][1]<dp[i-50][1]+1){
                            dp[i][0] = dp[i-50][0]+1;
                            dp[i][1] = dp[i-50][1]+1;
                        }
                    }
                }
            }

            return new int[]{dp[target][0], dp[target][1]};
        }
    }
}
