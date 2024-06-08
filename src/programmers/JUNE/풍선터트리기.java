package programmers.JUNE;

public class 풍선터트리기 {
    class Solution {
        public int solution(int[] a) {
            int[] left = new int[a.length];
            int[] right = new int[a.length];
            int left_min = a[0];
            int right_min = a[a.length-1];
            for(int i = 1; i<a.length -1; i++){
                left_min = Math.min(a[i], left_min);
                left[i] = left_min;

                right_min = Math.min(a[a.length-1-i], right_min);
                right[a.length-1-i] = right_min;
            }

            if (a.length==1) return 1;
            int ans = 2;
            for(int i = 1; i <= a.length - 2; i++) {
                if(a[i] > left[i] && a[i] > right[i]) continue;
                ans++;
            }
            return ans;
        }
    }
}
