package programmers;


import java.util.*;

public class 경주로건설 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] tmp = {{0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0},{0,0,0,0,1,0,0,0},{0,0,0,1,0,0,0,1},{0,0,1,0,0,0,1,0},{0,1,0,0,0,1,0,0},{1,0,0,0,0,0,0,0}};
        System.out.println(solution.solution(tmp));
    }
    static class Solution {
        int[][] d = {{1,0},{-1,0},{0,1},{0,-1}};
        boolean [][][] visited;
        public int solution(int[][] board) {
            visited = new boolean[board.length][board.length][4];
            return bfs(board);
        }

        private int bfs(int[][] board) {
            Queue<Node> q = new LinkedList<>();
            q.add(new Node(0, 0, -1, 0));
            int cost = Integer.MAX_VALUE;

            while (!q.isEmpty()) {
                Node now = q.poll();
                if(now.r == board.length-1 && now.c == board.length-1) {
                    cost = Math.min(cost,now.cost);
                }

                for (int i = 0; i < 4; i++) {
                    int dr = now.r + d[i][0];
                    int dc = now.c + d[i][1];

                    if(dr<0 || dr >= board.length || dc<0 || dc >= board.length || board[dr][dc] == 1) {
                        continue;
                    }

                    int nextCost = now.cost;
                    if(now.dir == -1 || now.dir == i) {
                        nextCost += 100;
                    }
                    else {
                        nextCost += 600;
                    }

                    if (!visited[dr][dc][i] || board[dr][dc] >= nextCost) {
                        q.add(new Node(dr, dc, i, nextCost));
                        visited[dr][dc][i] = true;
                        board[dr][dc] = nextCost;
                    }
                }
            }
            return cost;
        }
    }
    public static class Node {
        int r, c, dir, cost;

        public Node(int r, int c, int dir, int cost) {
            this.r = r;
            this.c = c;
            this.dir = dir;
            this.cost = cost;
        }
    }
}
