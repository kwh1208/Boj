import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Boj_9007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String s1 = br.readLine();
            StringTokenizer str1 = new StringTokenizer(s1);
            int k = Integer.parseInt(str1.nextToken());
            int n = Integer.parseInt(str1.nextToken());
            int[] c1 = new int[n];
            int[] c2 = new int[n];
            int[] c3 = new int[n];
            int[] c4 = new int[n];
            String s2 = br.readLine();
            StringTokenizer str2 = new StringTokenizer(s2);
            String s3 = br.readLine();
            StringTokenizer str3 = new StringTokenizer(s3);
            String s4 = br.readLine();
            StringTokenizer str4 = new StringTokenizer(s4);
            String s5 = br.readLine();
            StringTokenizer str5 = new StringTokenizer(s5);
            for (int j = 0; j < n; j++) {
                c1[j] = Integer.parseInt(str2.nextToken());
                c2[j] = Integer.parseInt(str3.nextToken());
                c3[j] = Integer.parseInt(str4.nextToken());
                c4[j] = Integer.parseInt(str5.nextToken());
            }
            int[] sum1 = new int[n*n];
            int[] sum2 = new int[n*n];
            int tmp = 0;
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    sum1[tmp] = c1[j]+c2[l];
                    sum2[tmp] = c3[j]+c4[l];
                    tmp++;
                }
            }
            Arrays.sort(sum1);
            Arrays.sort(sum2);
            int s = 0;
            int e = n*n-1;
            int ans = Integer.MAX_VALUE;
            while (true){
                if(s==n*n||e==-1) break;
                int sum = sum1[s]+sum2[e];
                if(Math.abs(sum-k)<Math.abs(ans-k)) ans=sum;
                else if(Math.abs(sum-k)==Math.abs(ans-k)&&sum<ans) ans=sum;
                if(sum>k) {e--;}
                else if(sum<k) {s++;}
                else if(sum==k) {break;}
            }
            System.out.println(ans);
        }
    }
}
