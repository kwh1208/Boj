package programmers.JUNE;

public class 쿠키구입 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1,2,4,5}));
    }
    static class Solution {
        public int solution(int[] cookie) {
            int answer = 0;
            for (int i = 0; i < cookie.length-1; i++) {
                int m = i;
                int r = i+1;
                int left = cookie[m];
                int right = cookie[r];
                while (m >= 0 && r < cookie.length) {
                    if (left==right){
                        answer = Math.max(answer, left);
                    }
                    if (left<=right && m > 0){
                        left += cookie[--m];
                    } else if (left > right && r < cookie.length - 1) {
                        right = cookie[++r];
                    }else {
                        break;
                    }
                }
            }
            return answer;
        }
    }
}