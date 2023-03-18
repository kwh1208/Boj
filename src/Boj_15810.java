import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_15810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int[] time = new int[n];
        int m = Integer.parseInt(str.nextToken());
        str= new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            time[i] = Integer.parseInt(str.nextToken());
        }
        String num = "1000000000000";
        long s = 1;
        long e = Long.valueOf(num);
        long ans = 0;
        while (true){
            if(s>e) break;
            long mid = (s+e)/2;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum+=mid/time[i];
            }
            if(sum>=m){
                ans=mid;
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        System.out.println(ans);
    }
}
