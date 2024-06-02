package programmers;

import java.util.ArrayList;

public class 영어끝말잇기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
        for (int i : solution1) {
            System.out.println(i);
        }
    }
    static class Solution {
        public int[] solution(int n, String[] words) {
            ArrayList<String> tmp = new ArrayList<>();
            String prev = words[0];
            tmp.add(prev);
            String now = "";
            for(int i = 1;i<words.length;i++){
                now = words[i];
                if(tmp.contains(now)){
                    return makeAns(n, i+1);
                }
                if(prev.charAt(prev.length()-1)!=now.charAt(0)){
                    return makeAns(n, i+1);
                }
                tmp.add(now);
                prev = now;
            }
            return new int[]{0, 0};
        }

        private int[] makeAns(int n, int i) {
            if (i%n==0){
                return new int[]{n, i/n};
            }
            else {
                return new int[]{i%n, i/n+1};
            }
        }
    }
}