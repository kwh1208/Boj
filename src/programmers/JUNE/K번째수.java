package programmers.JUNE;

import java.util.ArrayList;
import java.util.Collections;

public class K번째수 {
    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            for(int i = 0;i<commands.length;i++){
                int s = commands[i][0];
                int e = commands[i][1];
                int k = commands[i][2];

                ArrayList<Integer> tmp = new ArrayList<>();
                for (int j = s-1; j < e; j++) {
                    tmp.add(array[j]);
                }
                Collections.sort(tmp);
                answer[i] = tmp.get(k-1);
            }
            return answer;
        }
    }
}
