package programmers;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1,3,2,4,2});
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
    static class Solution {
        public int[] solution(int[] answers) {
            int[] fi = {1, 2, 3, 4, 5};
            int[] se = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] th = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            int[] cnt = new int[3];
            for (int i = 0; i < answers.length; i++) {
                //1
                if (answers[i]==fi[i%5]){
                    cnt[0]++;
                }
                //2
                if (answers[i]==se[i%8]){
                    cnt[1]++;
                }
                //3
                if (answers[i]==th[i%10]){
                    cnt[2]++;
                }
            }
            int maxScore = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
            List<Integer> bestStudents = new ArrayList<>();

            for (int i = 0; i < cnt.length; i++) {
                if (cnt[i] == maxScore) {
                    bestStudents.add(i + 1);
                }
            }

            int[] result = new int[bestStudents.size()];
            for (int i = 0; i < bestStudents.size(); i++) {
                result[i] = bestStudents.get(i);
            }

            return result;
        }
    }
}
