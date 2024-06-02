package programmers;

import java.util.Arrays;

public class 합승택시요금 {
    static class Solution {
        public int solution(int n, int s, int a, int b, int[][] fares) {
            int[][] dist = new int[n + 1][n + 1];

            // 초기화
            for (int i = 0; i <= n; i++) {
                Arrays.fill(dist[i], 100_000_000);
                dist[i][i] = 0;
            }

            for (int[] fare : fares)
                dist[fare[0]][fare[1]] = dist[fare[1]][fare[0]] = fare[2];

            
            for (int k = 1; k <= n; k++) {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        if (dist[i][j] > dist[i][k] + dist[k][j])
                            dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }

            int ans = dist[s][a] + dist[s][b];
            for (int i = 1; i <= n; i++) {
                ans = Math.min(ans, dist[s][i]+dist[i][a]+dist[i][b]);
            }
            return ans;
    }

}

}
