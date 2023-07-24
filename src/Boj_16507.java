import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_16507 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        int t = Integer.parseInt(str.nextToken());
        int[][] photo = new int[n+1][m+1];
        for (int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                photo[i+1][j+1] = photo[i+1][j]+photo[i][j+1]-photo[i][j]+Integer.parseInt(str.nextToken());
            }
        }
        for (int i = 0; i < t; i++) {
            str = new StringTokenizer(br.readLine());
            int start_x = Integer.parseInt(str.nextToken());
            int start_y = Integer.parseInt(str.nextToken());
            int end_x = Integer.parseInt(str.nextToken());
            int end_y = Integer.parseInt(str.nextToken());
            int total = photo[end_x][end_y]-photo[start_x-1][end_y]-photo[end_x][start_y-1]+photo[start_x-1][start_y-1];
            int num = (end_x-start_x+1)*(end_y-start_y+1);
            int ans = total/num;
            System.out.println(ans);
        }
    }
}
