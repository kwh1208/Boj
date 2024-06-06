package programmers;

import java.util.Arrays;

public class 최고의집합 {
    class Solution {
        public int[] solution(int n, int s) {
            if (s/n==0){
                return new int[]{-1};
            }
            int[] ans = new int[n];
            Arrays.fill(ans, s/n);
            if(s%n==0){
                return ans;
            }
            for(int i = 0;i<s%n;i++){
                ans[n-1-i]++;
            }
            return ans;
        }
    }
}
