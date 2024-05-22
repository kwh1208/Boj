package programmers;
import java.util.*;

public class 네트워크 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
    }
    static class Solution {
        static boolean[] visited;
        static Queue<Integer> q = new LinkedList<>();

        public int solution(int n, int[][] computers) {
            int answer = 0;
            visited = new boolean[n];

            for(int i=0; i<n; i++) {
                if(!visited[i]) {

                    bfs(i, computers, n);
                    answer++;
                }
            }

            return answer;
        } // End of main

        static void bfs(int i, int[][] computers, int n) {
            q.add(i);
            visited[i] = true;

            while( !q.isEmpty() ) {
                int value = q.poll();

                for(int j=0; j<n; j++) {
                    if(!visited[j] && computers[value][j] == 1) {
                        visited[j] = true;
                        q.add(j);
                    }
                }

            }

        }
    }
}
