import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_17425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        long[] sum = new long[1000001];//f(x)
        long[] ans = new long[1000001];//g(x)
        for (int i = 1; i <= 1000000; i++) {
            for (int j = 1; i*j <= 1000000; j++) {
                sum[i*j]+=i;
            }
        }
        for (int i = 1; i <= 1000000; i++) {
            ans[i]=ans[i-1]+sum[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(ans[Integer.parseInt(br.readLine())]).append("\n");
        }
        System.out.println(sb);
    }
}
