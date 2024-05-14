package programmers;

import java.util.HashMap;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] parti = {"leo", "kiki", "eden"};
        String[] com = {"eden", "kiki"};
        System.out.println(solution.solution(parti, com));
    }

    static class Solution {
        public String solution(String[] participant, String[] completion) {
            HashMap<String, Integer> par = new HashMap<>();
            for (int i = 0; i < participant.length; i++) {
                if (par.containsKey(participant[i])) {
                    par.put(participant[i], par.get(participant[i]) + 1);
                }
                else {
                    par.put(participant[i], 1);
                }
            }
            HashMap<String, Integer> comp = new HashMap<>();
            for (int i = 0; i < completion.length; i++) {
                if (comp.containsKey(completion[i])) {
                    par.put(completion[i], par.get(completion[i]) - 1);
                }
                else{
                    comp.put(completion[i], 1);
                }
            }

            for (String s : par.keySet()) {
                if (!comp.containsKey(s)) {
                    return s;
                }
                if (par.get(s) > comp.get(s)) {
                    return s;
                }
            }

            String answer = "";
            return answer;
        }
    }
}
