import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str= new StringTokenizer(br.readLine());
        int[] num = new int[n];
        int[] sum = new int[n+1];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(str.nextToken());
            sum[i+1] = sum[i]+num[i];
        }
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            str = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(str.nextToken());
            int e = Integer.parseInt(str.nextToken());

            System.out.println(sum[e]-sum[s-1]);
        }

    }
}
