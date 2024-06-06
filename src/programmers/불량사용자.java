package programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class 불량사용자 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"}, new String[]{"fr*d*", "*rodo", "******", "******"}));
    }
    static class Solution {
        Set<Set<String>> resultSet = new HashSet<>();
        public int solution(String[] user_id, String[] banned_id) {
            dfs(user_id, banned_id, new ArrayList<>(), 0, 0);
            return resultSet.size();
        }

        private void dfs(String[] userId, String[] bannedId, ArrayList<String> banList, int cnt, int now) {
            if (now== bannedId.length){
                resultSet.add(new HashSet<>(banList));
                return;
            }

            String chkId = bannedId[now];
            for (int i = 0; i < userId.length; i++) {
                if (chkId.length()!=userId[i].length()||banList.contains(userId[i])) {
                    continue;
                }
                boolean flag = true;
                for (int j = 0; j < chkId.length(); j++) {
                    if (chkId.charAt(j) != userId[i].charAt(j)&&chkId.charAt(j)!='*') {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    banList.add(userId[i]);
                    dfs(userId, bannedId, banList, cnt+1, now+1);
                    banList.remove(userId[i]);
                }
            }

        }
    }
}