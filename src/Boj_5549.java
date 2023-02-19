import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class Boj_5549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(str.nextToken());
        int n = Integer.parseInt(str.nextToken());
        int k = Integer.parseInt(br.readLine());
        int[][][] map = new int[m+1][n+1][3];
        int[][][] joi = new int[m+1][n+1][3];//0이 정글 1이 바다 2가 얼음.
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                char tmp = s.charAt(j);
                if(tmp=='J') {
                    map[i+1][j+1][0] = 1;
                    joi[i+1][j+1][0]=joi[i+1][j][0]+joi[i][j+1][0]-joi[i][j][0]+map[i+1][j+1][0];
                    joi[i+1][j+1][1]=joi[i+1][j][1]+joi[i][j+1][1]-joi[i][j][1]+map[i+1][j+1][1];
                    joi[i+1][j+1][2]=joi[i+1][j][2]+joi[i][j+1][2]-joi[i][j][2]+map[i+1][j+1][2];
                }
                if(tmp=='O') {
                    map[i+1][j+1][1] = 1;
                    joi[i+1][j+1][0]=joi[i+1][j][0]+joi[i][j+1][0]-joi[i][j][0]+map[i+1][j+1][0];
                    joi[i+1][j+1][1]=joi[i+1][j][1]+joi[i][j+1][1]-joi[i][j][1]+map[i+1][j+1][1];
                    joi[i+1][j+1][2]=joi[i+1][j][2]+joi[i][j+1][2]-joi[i][j][2]+map[i+1][j+1][2];
                }
                if(tmp=='I') {
                    map[i+1][j+1][2] = 1;
                    joi[i+1][j+1][0]=joi[i+1][j][0]+joi[i][j+1][0]-joi[i][j][0]+map[i+1][j+1][0];
                    joi[i+1][j+1][1]=joi[i+1][j][1]+joi[i][j+1][1]-joi[i][j][1]+map[i+1][j+1][1];
                    joi[i+1][j+1][2]=joi[i+1][j][2]+joi[i][j+1][2]-joi[i][j][2]+map[i+1][j+1][2];
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            str = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(str.nextToken());
            int y1 = Integer.parseInt(str.nextToken());
            int x2 = Integer.parseInt(str.nextToken());
            int y2 = Integer.parseInt(str.nextToken());
            //정글, 바다 , 얼음순서
            int jungle = joi[x2][y2][0]-joi[x1-1][y2][0]-joi[x2][y1-1][0]+joi[x1-1][y1-1][0];
            int ocean = joi[x2][y2][1]-joi[x1-1][y2][1]-joi[x2][y1-1][1]+joi[x1-1][y1-1][1];
            int ice = joi[x2][y2][2]-joi[x1-1][y2][2]-joi[x2][y1-1][2]+joi[x1-1][y1-1][2];
            sb.append(jungle).append(" ").append(ocean).append(" ").append(ice).append("\n");
        }
        System.out.println(sb);
    }
}
