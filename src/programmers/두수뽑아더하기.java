package programmers;

import java.util.Arrays;
import java.util.HashSet;

public class 두수뽑아더하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = {5,0,2,7};
        solution.solution(num);
    }
    static class Solution {
        public int[] solution(int[] numbers) {
            HashSet<Integer> ans = new HashSet<>();
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    ans.add(numbers[i]+numbers[j]);
                }
            }
            int[] arr = new int[ans.size()];
            int i = 0;
            for (Integer integer : ans) {
                arr[i++] = integer;
            }
            Arrays.sort(arr);

            return arr;
        }
    }
}
