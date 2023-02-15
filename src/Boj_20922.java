import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_20922 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());

        int [] numbers = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st2.nextToken());
        }

        int [] cnt = new int[100001];
        int s = 0, e = 0;
        int ans = 0;

        while (true) {
            if(e==n) break;
            while (e < n&&cnt[numbers[e]] + 1 <= k) {
                cnt[numbers[e++]]++;
            }
            if(e-s>ans) ans=e-s;
            cnt[numbers[s++]]--;
        }

        System.out.print(ans);
    }
}