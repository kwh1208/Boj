package programmers.JUNE;

import java.util.Arrays;
import java.util.Comparator;

public class 단속카메라 {
    class Solution {
        public int solution(int[][] routes) {
            Arrays.sort(routes, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return Integer.compare(o1[0], o2[0]);
                }
            });
            boolean[] visited = new boolean[routes.length];
            int cnt = 0;
            int now;
            for (int i = 0; i < routes.length; i++) {
                if (!visited[i]) {
                    cnt++;
                    now = routes[i][1];
                    for (int j = 0; j < routes.length; j++) {
                        if(routes[j][0] <= now && routes[j][1] <= now) {
                            visited[j] = true;
                        }
                    }
                }
            }
            return cnt;
        }
    }
}