package programmers;

import java.util.HashMap;

public class 오픈채팅방 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"});
    }
    static class Solution {
        public String[] solution(String[] record) {
            HashMap<String, String> map = new HashMap<>();
            int cnt = 0;
            String tmp;
            for (int i = 0; i < record.length; i++) {
                tmp = record[i];
                String[] split = tmp.split(" ");
                if (split[0].equals("Enter")){
                    map.put(split[1], split[2]);
                }
                else if (split[0].equals("Change")){
                    map.put(split[1], split[2]);
                    cnt++;
                }
            }
            String[] answer = new String[record.length-cnt];
            int idx = 0;
            for (int i = 0; i < record.length; i++) {
                tmp = record[i];
                String[] split = tmp.split(" ");
                if (split[0].equals("Enter")){
                    answer[idx++] = split[1] + "님이 들어왔습니다.";
                }
                else if (split[0].equals("Leave")){
                    answer[idx++] = split[1] + "님이 나갔습니다.";
                }
            }
            return answer;
        }
    }
}
