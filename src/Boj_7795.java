import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_7795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(str.nextToken());
            int m = Integer.parseInt(str.nextToken());
            int[] A = new int[n];
            int[] B = new int[m];
            str = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                A[j] = Integer.parseInt(str.nextToken());
            }
            str = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                B[j] = Integer.parseInt(str.nextToken());
            }
            Arrays.sort(A);
            Arrays.sort(B);
            int ans = 0;
            int cnt = 0;
            int e = 0;
            for (int j = 0; j < n; j++) {
                while (true){
                    if(e==m) break;
                    if(A[j]>B[e])
                    {e++;cnt++;}
                    else break;
                }
                ans+=cnt;
            }
            System.out.println(ans);
        }
    }
}
