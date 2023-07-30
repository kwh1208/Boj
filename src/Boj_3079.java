import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_3079 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        long m = Integer.parseInt(str.nextToken());

        long[] time = new long[n];
        long max = 0;
        for (int i = 0; i < n; i++) {
            time[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, time[i]);
        }

        long s = 0;
        long e = max * m;
        long ans = Long.MAX_VALUE;
        while (s<=e){
            long mid = (s+e)/2;
            long result = 0;
            for (int i = 0; i < n; i++) {
                result+=mid/time[i];
                if(result>=m) break;
            }
            if(result>=m){
                ans = Math.min(ans,mid);
                e = mid-1;
            }
            else {
                s=mid + 1;
            }
        }
        System.out.println(ans);

    }
}
