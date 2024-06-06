package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class 가장먼노드 {
    class Solution {
        public int solution(int n, int[][] edge) {
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
            for (int i = 0; i <= n; i++) {
                map.put(i, new ArrayList<>());
            }
            for (int[] tmp : edge) {
                map.get(tmp[0]).add(tmp[1]);
                map.get(tmp[1]).add(tmp[0]);
            }

            boolean[] visited = new boolean[n+1];
            Queue<Integer> q = new LinkedList<>();
            q.add(1);
            visited[1] = true;
            int[] dis = new int[n+1];

            while (!q.isEmpty()) {
                int now = q.poll();
                for(int tmp : map.get(now)) {
                    if(visited[tmp]) continue;
                    q.add(tmp);
                    visited[tmp] = true;
                    dis[tmp] = dis[now]+1;
                }
            }
            int cnt = 0;
            int max = 0;
            for (int i = 0; i < dis.length; i++) {
                if(dis[i] > max) {
                    max = dis[i];
                    cnt = 1;
                }
                else if(dis[i] == max) {
                    cnt++;
                }
            }

            return cnt;
        }
    }
}