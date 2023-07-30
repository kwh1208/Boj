import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_16401 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(str.nextToken());
        int n = Integer.parseInt(str.nextToken());

        long[] snack = new long[n];
        str = new StringTokenizer(br.readLine());
        long max = 0;

        for (int i = 0; i < n; i++) {
            snack[i] = Long.parseLong(str.nextToken());
            max = Math.max(max, snack[i]);
        }

        long s = 1;
        long e = max;
        long ans = 0;
        while (s<=e){
            long mid = (s+e)/2;
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                cnt+=snack[i]/mid;
            }

            if(cnt>=m){
                ans = mid;
                s = mid+1;
            }
            else {
                e= mid-1;
            }
        }
        System.out.println(ans);
    }
}
