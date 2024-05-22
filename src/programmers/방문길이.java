package programmers;

public class 방문길이 {
    public static void main(String[] args) {
        String dir = "LULLLLLLU";
        Solution solution = new Solution();
        System.out.println(solution.solution(dir));;
    }
    static class Solution {
        public int solution(String dirs) {
            boolean[][] w = new boolean[11][11];
            boolean[][] l = new boolean[11][11];

            int nx = 5;
            int ny = 5;

            for (int i = 0; i < dirs.length(); i++) {
                char move = dirs.charAt(i);
                if (move == 'U') {
                    if(ny+1<=10){
                        ny++;
                        l[nx][ny] = true;
                    }
                }
                else if (move == 'D') {
                    if(ny-1>=0){
                        l[nx][ny] = true;
                        ny--;
                    }
                }
                else if (move == 'L') {
                    if(nx-1>=0){
                        w[nx][ny] = true;
                        nx--;
                    }
                }
                else if (move == 'R') {
                    if(nx+1<=10){
                        nx++;
                        w[nx][ny] = true;
                    }
                }
            }

            int cnt = 0;
            for (int i = 0; i < w.length; i++) {
                for (int j = 0; j < w[0].length; j++) {
                    if (w[i][j]) {
                        cnt++;
                    }
                }
            }
            for (int i = 0; i < w.length; i++) {
                for (int j = 0; j < w[0].length; j++) {
                    if (l[i][j]) {
                        cnt++;
                    }
                }
            }

            return cnt;
        }
    }
}
