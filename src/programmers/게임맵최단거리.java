package programmers;

import java.util.Deque;
import java.util.LinkedList;

public class 게임맵최단거리 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}}));;
    }
    static class Solution {
        public int solution(int[][] maps) {
            int m = maps.length;
            int n = maps[0].length;
            int[] dir_x = {-1, 1, 0, 0};
            int[] dir_y = {0, 0, -1, 1};
            Deque<node> dq = new LinkedList<>();
            dq.add(new node(0, 0, 1));
            boolean[][] visited = new boolean[m][n];
            visited[0][0] = true;
            while (!dq.isEmpty()) {
                node now = dq.poll();
                int x = now.x;
                int y = now.y;
                int cnt = now.cnt;

                if (x == m-1 && y == n-1) {
                    return cnt;
                }

                for (int i = 0; i < 4; i++) {
                    int nx = x + dir_x[i];
                    int ny = y + dir_y[i];

                    // 맵의 범위 내에 있고, 벽이 아니며, 방문하지 않은 경우
                    if (nx >= 0 && nx < m && ny >= 0 && ny < n && maps[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        dq.add(new node(nx, ny, cnt + 1));
                    }
                }
            }
            return -1;
        }
        class node{
            int x, y, cnt;

            public node(int x, int y, int cnt) {
                this.x = x;
                this.y = y;
                this.cnt = cnt;
            }
        }
    }
}