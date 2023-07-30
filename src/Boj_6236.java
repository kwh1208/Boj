import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_6236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        int[] money = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            money[i] = Integer.parseInt(br.readLine());
            max=Math.max(max, money[i]);
        }

        int s = max;
        int e = 10_000 * 100_000;
        int ans = 0;
        while (s<=e){
            int mid = (s+e)/2;
            int tmp = 0;
            int in_hand = 0;
            for (int i = 0; i < n; i++) {
                if(in_hand<money[i]){
                    in_hand=mid;
                    tmp++;
                }
                in_hand-=money[i];
            }
            if(tmp<=m){
                ans=mid;
                e=mid - 1;
            }
            else {
                s=mid + 1;
            }
        }
        System.out.println(ans);
    }
}
