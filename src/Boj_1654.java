import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(str.nextToken());
        int n = Integer.parseInt(str.nextToken());
        int[] length = new int[k];
        for (int i = 0; i < k; i++) {
            length[i] = Integer.parseInt(br.readLine());
        }
        long s = 1;
        long e = Integer.MAX_VALUE;
        long ans = 0;
        while (s <= e) {
            long mid = (s + e) / 2;
            int cnt = 0;
            for (int i = 0; i < k; i++) {
                cnt += length[i] / mid;
            }
            if (cnt >= n) {
                s = mid + 1;
                ans = mid;
            } else {
                e = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
