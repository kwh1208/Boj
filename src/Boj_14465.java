import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_14465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        StringTokenizer str1 = new StringTokenizer(s1);
        int n = Integer.parseInt(str1.nextToken());
        int k = Integer.parseInt(str1.nextToken());
        int b = Integer.parseInt(str1.nextToken());
        boolean[] light = new boolean[n+1];
        for (int i = 0; i < b; i++) {
            int tmp = Integer.parseInt(br.readLine());
            light[tmp-1] = true;
        }
        int s = 0;
        int e = k-1;
        int ans = 0;
        for (int i = s; i <= e; i++) {
            if(light[i]) ans++;
        }
        int tmp = ans;
        while (true){
            if(e==n) break;
            if(light[s]) tmp--;
            s++;
            e++;
            if(light[e]) tmp++;
            if(tmp<ans) ans = tmp;
        }
        if(ans>0) System.out.println(ans);
        else System.out.println(0);
    }
}
