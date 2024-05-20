package programmers;

public class 피로도 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] dungeons = {{7, 3},{5, 4},{1, 1}};
        System.out.println(solution.solution(8, dungeons));
    }
    static class Solution {
        int ans = 0;
        public int solution(int k, int[][] dungeons) {
            boolean[] visited = new boolean[dungeons.length];
            dfs(dungeons, visited, k, 0);
            return ans;
        }

        private void dfs(int[][] dungeons, boolean[] visited, int k, int cnt){
            for(int i = 0; i < dungeons.length; i++){
                if(dungeons[i][0] <= k && !visited[i] && dungeons[i][1] <= k){
                    visited[i] = true;
                    dfs(dungeons, visited, k-dungeons[i][1], cnt+1);
                    visited[i] = false;
                }
            }
            ans = Math.max(ans, cnt);
        }
    }
}