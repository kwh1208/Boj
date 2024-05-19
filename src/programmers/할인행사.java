package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class 할인행사 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] num = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solution.solution(want, num, discount));
    }
    static class Solution {
        public int solution(String[] want, int[] number, String[] discount) {
            int ans = 0;
            HashMap<String, Integer> now = new HashMap<>();
            HashMap<String, Integer> target = new HashMap<>();
            for (int i = 0; i < number.length; i++) {
                target.put(want[i], number[i]);
            }

            List<String> wants = Arrays.asList(want);

            for (int i = 0; i < 10; i++) {
                if (wants.contains(discount[i])) {
                    if (now.containsKey(discount[i])) {
                        now.put(discount[i], now.get(discount[i]) + 1);
                    }
                    else {
                        now.put(discount[i], 1);
                    }
                }
            }

            boolean flag = true;
            for (String s : target.keySet()) {
                if (!now.containsKey(s)) {
                    flag = false;
                    break;
                }
                if(!target.get(s).equals(now.get(s))){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans++;
            }


            for (int i = 10; i < discount.length; i++) {
                if (wants.contains(discount[i-10])) {
                    if (now.containsKey(discount[i-10])) {
                        now.put(discount[i-10], now.get(discount[i-10]) - 1);
                    }
                }
                if (wants.contains(discount[i])) {
                    if (now.containsKey(discount[i])) {
                        now.put(discount[i], now.get(discount[i]) + 1);
                    }
                    else {
                        now.put(discount[i], 1);
                    }
                }
                flag = true;
                for (String s : target.keySet()) {
                    if (!now.containsKey(s)) {
                        flag = false;
                        break;
                    }
                    if(!target.get(s).equals(now.get(s))){
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ans++;
                }
            }


            return ans;
        }
    }
}
