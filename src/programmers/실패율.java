package programmers;

import java.util.*;

public class 실패율 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(4, new int[]{4,4,4,4,4});
    }
    static class Solution {
        public int[] solution(int N, int[] stages) {
            int[] answer = new int[N];
            Arrays.sort(stages);
            int total = stages.length;
            int[] stage_fail = new int[N+1];
            int[] stage_total = new int[N+2];
            int[] stage_visit = new int[N+2];
            HashMap<Integer, Double> failure_percentage = new HashMap<>();
            stage_total[0] = total;
            for (int i = 0; i < stages.length; i++) {
                if (stages[i] != N+1) {
                    stage_fail[stages[i]]++;
                }
            }
            for (int i = 0; i < stages.length; i++) {
                if (stages[i]<=N) {
                    stage_visit[stages[i]]++;
                }
            }
            for (int i = 0; i < stage_total.length-1; i++) {
                stage_total[i+1] = stage_total[i]-stage_visit[i];
            }

            for (int i = 0; i <= N; i++) {
                if (stage_total[i] == 0) {
                    failure_percentage.put(i, 0.0);
                } else {
                    failure_percentage.put(i, (double) stage_fail[i] / stage_total[i]);
                }
            }
            failure_percentage.remove(0);

            List<Map.Entry<Integer, Double>> entryList = new ArrayList<>(failure_percentage.entrySet());
            entryList.sort((a, b) -> {
                int comp = b.getValue().compareTo(a.getValue());
                if (comp == 0) {
                    return a.getKey().compareTo(b.getKey());
                } else {
                    return comp;
                }
            });

            for (int i = 0; i < N; i++) {
                answer[i] = entryList.get(i).getKey();
            }

            return answer;
        }
    }
}