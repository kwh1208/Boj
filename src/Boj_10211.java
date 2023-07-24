import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10211 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer str;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] sum = new int[n+1];
            str = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                sum[j+1] = sum[j]+Integer.parseInt(str.nextToken());
            }
            int max = Integer.MIN_VALUE;
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k < j; k++) {
                    if(sum[j]-sum[k]>max) max = sum[j]-sum[k];
                }
            }
            System.out.println(max);
        }
    }
}
