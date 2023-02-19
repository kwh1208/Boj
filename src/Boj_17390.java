import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_17390 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int q = Integer.parseInt(str.nextToken());
        int[] num = new int[n];
        int[] prefix = new int[n+1];
        str = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(str.nextToken());
        }
        Arrays.sort(num);
        for (int i = 0; i < n; i++) {
            prefix[i+1] = prefix[i]+num[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            str = new StringTokenizer(br.readLine());
            int s= Integer.parseInt(str.nextToken());
            int e= Integer.parseInt(str.nextToken());
            sb.append(prefix[e]-prefix[s-1]).append("\n");
        }
        System.out.println(sb);
    }
}
