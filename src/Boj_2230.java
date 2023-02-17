import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_2230 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);
        int s = 0;
        int e = 1;
        int ans = Integer.MAX_VALUE;
        while (true){
            if(e==n||s==n){break;}
            if(s==e) {e++;continue;}
            int dif = num[e]-num[s];
            if(dif>m&&dif<ans) ans = dif;
            if(dif==m) ans = dif;
            if(dif<m) e++;
            else s++;
        }
        System.out.println(ans);
    }
}
