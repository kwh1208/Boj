import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_13702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int k = Integer.parseInt(str.nextToken());
        int[] alcohol = new int[n];
        for (int i = 0; i < n; i++) {
            alcohol[i] = Integer.parseInt(br.readLine());
        }
        long s = 1;
        long e = Integer.MAX_VALUE;
        int ans = 0;
        while (true){
            if(s>e) break;
            long mid = (s+e)/2;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                cnt+=alcohol[i]/mid;
            }
            if(cnt>=k){
                s=mid+1;
                ans= (int) mid;
            }
            else {
                e=mid-1;
            }
        }
        System.out.println(ans);
    }
}
