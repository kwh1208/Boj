import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_13422 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        StringTokenizer str;
        for (int i = 0; i < t; i++) {
            str = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(str.nextToken());//집의 수
            int m = Integer.parseInt(str.nextToken());//훔칠수 있는 집의 수
            int k = Integer.parseInt(str.nextToken());//최대 돈
            int[] house = new int[n+m-1];
            str = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                house[j] = Integer.parseInt(str.nextToken());
            }
            for (int j = n; j < n + m - 1; j++) {
                house[j] = house[j-n];
            }
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum+=house[j];
            }
            int cnt;
            if(sum>=k) cnt=0;
            else cnt = 1;
            for (int j = 1; j < n; j++) {
                sum-=house[j-1];
                sum+=house[j+m-1];
                if(sum<k) cnt++;
            }
            if(n==m) cnt/=m;
            System.out.println(cnt);
        }

    }
}
