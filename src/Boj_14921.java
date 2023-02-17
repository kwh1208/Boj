import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_14921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] acid =new int[n];
        String s1 = br.readLine();
        StringTokenizer str1 = new StringTokenizer(s1);
        for (int i = 0; i < n; i++) {
            acid[i] = Integer.parseInt(str1.nextToken());
        }
        int s = 0;
        int e = n-1;
        int dif = Integer.MAX_VALUE;
        int ans1 = 0;
        int ans2 = 0;
        while (true){
            if(s>=e) break;
            int sum = acid[s]+acid[e];
            if(Math.abs(sum)<dif) {dif = Math.abs(sum);ans1 = acid[s];ans2 = acid[e];}
            if(sum==0) break;
            else if (sum > 0) {
                e--;
            }
            else {s++;}

        }
        System.out.println(ans1+ans2);
    }
}
