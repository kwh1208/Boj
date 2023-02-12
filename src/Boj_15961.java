import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_15961 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        StringTokenizer str1 = new StringTokenizer(s1);
        int n = Integer.parseInt(str1.nextToken());
        int d = Integer.parseInt(str1.nextToken());
        int k = Integer.parseInt(str1.nextToken());
        int c = Integer.parseInt(str1.nextToken());
        int[] sushi = new int[n+k-1];
        for (int i = 0; i < n; i++) {
            sushi[i] = Integer.parseInt(br.readLine());
        }
        for (int i = n; i < n + k - 1; i++) {
            sushi[i] = sushi[i-n];
        }
        int[] cnt = new int[d+1];
        int s = 0;
        int e = k-1;
        int ans = 0;
        for (int i = s; i <= e; i++) {
            cnt[sushi[i]]++;
        }
        int tmp = 0;
        for (int i = 0; i < d + 1; i++) {
            if(cnt[i] != 0) tmp++;
        }
        while (true){
            if(tmp>ans){
                if(cnt[c]==0) ans = tmp+1;
                else ans = tmp;
            }
            if(tmp==ans&&cnt[c]==0) ans = tmp+1;
            if(e==n + k - 2) break;
            //s부터 한칸 땡기기
            cnt[sushi[s]]--;
            if(cnt[sushi[s]]==0) tmp--;
            s++;
            //e 땡기기
            e++;
            cnt[sushi[e]]++;
            if(cnt[sushi[e]]==1) tmp++;
        }
        System.out.println(ans);
    }
}
