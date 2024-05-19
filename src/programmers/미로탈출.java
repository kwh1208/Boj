package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 미로탈출 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] maps = {"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"};
        System.out.println(solution.solution(maps));
        String[] maps1 = {"LOOXS","OOOOX","OOOOO","OOOOO","EOOOO"};
        System.out.println(solution.solution(maps1));
        String[] maps2 = {"SOOOL", "XXOXX", "XXOOE"};
        System.out.println(solution.solution(maps2));
    }
    static class Solution {
        int ans = 0;
        public int solution(String[] maps) {
            int[] start = {};
            int[] lever = {};
            int[] end = {};
            String[][] map = new String[maps.length][maps[0].length()];
            for (int i = 0; i < maps.length; i++) {
                String[] tmp = maps[i].split("");
                for (int j = 0; j < tmp.length; j++) {
                    map[i][j] = tmp[j];
                }
            }

            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[0].length; j++) {
                    if (map[i][j].equals("S")) {
                        start = new int[]{i, j};
                    }
                    if (map[i][j].equals("L")) {
                        lever = new int[]{i, j};
                    }
                    if (map[i][j].equals("E")) {
                        end = new int[]{i, j};
                    }
                }
            }

            int result1 = bfs(start, lever, map);

            int result2 = bfs(lever, end, map);

            if (result1 == 0 || result2 == 0) {
                return -1;
            }
            return result1+result2;
        }
        int bfs(int[] start, int[] target, String[][] map){
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{start[0], start[1], 0});
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0 , -1, 1};

            boolean[][] visited = new boolean[map.length][map[0].length];

            while (!queue.isEmpty()) {
                int[] tmp = queue.poll();
                int x = tmp[0];
                int y = tmp[1];
                int cnt = tmp[2];
                visited[x][y] = true;

                if (x==target[0] && y==target[1]) {
                    return cnt;
                }

                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (nx >= 0 && nx < map.length && ny >= 0 && ny < map[0].length && !visited[nx][ny]){
                        if (!map[nx][ny].equals("X")){
                            visited[nx][ny] = true;
                            queue.add(new int[]{nx, ny, cnt+1});
                        }
                    }
                }
            }
            return 0;
        }
    }
}
