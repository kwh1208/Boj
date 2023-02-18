import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        int[][] arr = new int[n+1][n+1];//입력받을 배열
        int[][] prefix = new int[n+1][n+1];//누적합용 배열

        for (int i = 1; i < n+1; i++) {
            str = new StringTokenizer(br.readLine());
            for (int j = 1; j < n+1; j++) {
                arr[i][j] = Integer.parseInt(str.nextToken());
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                prefix[i][j] = prefix[i-1][j]+prefix[i][j-1]-prefix[i-1][j-1]+arr[i][j];//누적합 만들기
            }
        }

        for (int i = 0; i < m; i++) {
            str = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(str.nextToken());
            int y1 = Integer.parseInt(str.nextToken());
            int x2 = Integer.parseInt(str.nextToken());
            int y2 =  Integer.parseInt(str.nextToken());
            int ans = prefix[x2][y2]-prefix[x1-1][y2]-prefix[x2][y1-1]+prefix[x1-1][y1-1];//정답 구하기(이해가 잘 안되신다면 설명에 있는 그림처럼 더하고 빼고하면서 생각해보시면 됩니다.)
            System.out.println(ans);
        }
    }
}
