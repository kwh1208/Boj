package programmers.JUNE;

import java.util.HashMap;
import java.util.HashSet;

public class N으로표현 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(5, 12);
    }
    static class Solution {
        public int solution(int N, int number) {
            HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
            for (int i = 1; i <= 8; i++) {
                map.put(i, new HashSet<>());
                StringBuilder sb = new StringBuilder();
                for (int j = 1; j <= i; j++) {
                    sb.append(N);
                }
                map.get(i).add(Integer.valueOf(sb.toString()));
            }
            for (int i = 2; i <= 8; i++) {
                for (int j = 1; j < i; j++) {
                   int k = i-j;
                    HashSet<Integer> nums1 = map.get(j);
                    HashSet<Integer> nums2 = map.get(k);
                    for (Integer num1 : nums1) {
                        for (Integer num2 : nums2) {
                            map.get(i).add(num1 + num2);
                            map.get(i).add(num1 - num2);
                            map.get(i).add(num1 * num2);
                            if (num2!=0){
                                map.get(i).add(num1 / num2);
                            }
                        }
                    }
                }
            }
            for (int i = 1; i < 9; i++) {
                if (map.get(i).contains(number)){
                    return i;
                }
            }
            return -1;
        }
    }
}
