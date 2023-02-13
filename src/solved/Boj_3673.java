package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.*;

public class Boj_3673 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            StringTokenizer str = new StringTokenizer(s);
            int d = Integer.parseInt(str.nextToken());//나눌수
            int n = Integer.parseInt(str.nextToken());//수열 개수
            long[] sum = new long[n+1];
            long[] remain = new long[d];
            String s1 = br.readLine();
            StringTokenizer str1 = new StringTokenizer(s1);
            for (int j = 1; j <= n; j++) {
                int tmp = Integer.parseInt(str1.nextToken());
                sum[j] = sum[j-1]+tmp;
                remain[(int)(sum[j]%d)]++;
            }
            long ans = 0;
            for (int j = 0; j < d; j++) {
                ans+=(remain[j])*(remain[j]-1)/2;
            }
            out.println(ans+remain[0]);
        }
    }
}
