package programmers;

import java.util.HashMap;

public class 다단계칫솔판매 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new String[]{"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"}, new String[]{"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"},
                new String[]{"young", "john", "tod", "emily", "mary"}, new int[]{12, 4, 2, 5, 10});
    }
    static class Solution {
        public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
            HashMap<String, String> parents = new HashMap<>();
            HashMap<String, Integer> ans = new HashMap<>();
            for (int i = 0; i < enroll.length; i++) {
                parents.put(enroll[i], referral[i]);
                ans.put(enroll[i], 0);
            }

            for (int i = 0; i < seller.length; i++) {
                int money = amount[i]*100;

                String parent = parents.get(seller[i]);
                String now = seller[i];
                ans.put(now, ans.get(now)+money-(money/10));
                money = (money/10);
                while (!parent.equals("-")){
                    String tmp = parent;
                    parent = parents.get(parent);
                    now = tmp;

                    ans.put(now, ans.get(now)+money-(money/10));
                    money = (money/10);
                    if (money < 1) {
                        break;
                    }
                }
            }
            int[] answer = new int[ans.size()];
            for (int i = 0; i < enroll.length; i++) {
                answer[i] = ans.get(enroll[i]);
            }
            return answer;
        }
    }
}
