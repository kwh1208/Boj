import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1222 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());
        int[] school = new int[(int)n];
        for (int i = 0; i < n; i++) {
            school[i] = Integer.parseInt(str.nextToken());
        }
        int[] cnt = new int[2000001];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j * j <= school[i]; j++) {
                if (school[i] % j == 0) {
                    cnt[j]++;
                    if (school[i] / j != j)
                        cnt[school[i] / j]++;
                }
            }
        }
        long ans = 0;
        for (long i = 1; i < 2000001; i++) {
            if(cnt[(int)i]<2) continue;
            if(cnt[(int)i]*i>ans) ans=cnt[(int)i]*i;
        }
        System.out.println(ans);
    }
}
