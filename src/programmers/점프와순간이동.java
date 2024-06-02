package programmers;

public class 점프와순간이동 {
    public class Solution {
        public int solution(int n) {
            int ans = 0;
            while (true){
                if (n == 0) return ans;

                if (n%2==1){
                    ans++;
                    n = n/2;
                }
                else {
                    n=n/2;
                }
            }
        }
    }
}