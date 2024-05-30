package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class 섬연결하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(6, new int[][]{{0, 1, 5}, {0, 3, 2}, {0, 4, 3}, {1, 4, 1}, {3, 4, 10}, {1, 2, 2}, {2, 5, 3}, {4, 5, 4}}));;
    }
    static class Solution {
        public int solution(int n, int[][] costs) {
            Arrays.sort(costs, Comparator.comparingInt(o -> o[2]));
            HashMap<Integer, Integer> map = new HashMap<>();
            boolean[] visited = new boolean[n];
            int ans = 0;
            int idx = 0;
            for (int i = 0; i < costs.length; i++) {
                if (!visited[costs[i][0]]&&!visited[costs[i][1]]) {
                    visited[costs[i][0]] = true;
                    visited[costs[i][1]] = true;
                    map.put(costs[i][0], idx);
                    map.put(costs[i][1], idx);
                    idx++;
                    ans+=costs[i][2];
                }
                else if(visited[costs[i][0]]&&visited[costs[i][1]]) {
                    if(!map.get(costs[i][0]).equals(map.get(costs[i][1]))) {
                        int tmp = map.get(costs[i][0]);
                        int target = map.get(costs[i][1]);
                        for (Integer integer : map.keySet()) {
                            if (tmp == map.get(integer)) {
                                map.replace(integer, target);
                            }
                        }
                        ans+=costs[i][2];
                    }
                }
                else if (visited[costs[i][0]]||visited[costs[i][1]]) {
                    visited[costs[i][0]] = true;
                    visited[costs[i][1]] = true;
                    if (map.containsKey(costs[i][0])) {
                        map.put(costs[i][1], map.get(costs[i][0]));
                    }
                    else {
                        map.put(costs[i][0], map.get(costs[i][1]));
                    }
                    ans+=costs[i][2];
                }
            }
            return ans;
        }
    }
}
