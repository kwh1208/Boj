import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj_3649 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while(true) {
            str = br.readLine();
            if(str==null) break;
            int x = Integer.parseInt(str);
            x*=10000000;//구멍
            int n = Integer.parseInt(br.readLine());
            int[] lego = new int[n];
            for(int i=0; i<n; i++) {
                lego[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(lego);
            int s = 0; 
            int e = n-1;
            boolean ans = false;
            int ans1 = 0;
            int ans2 = 0;
            while(true) {
                if(s>=e) break;
                int sum = lego[s]+lego[e];
                if(sum==x) {ans=true;ans1=lego[s];ans2=lego[e];break;}
                else if(sum<x) s++;
                else e--;
            }
            if(ans) System.out.println("yes "+ans1+" "+ans2);
            else System.out.println("danger");
        }
    }
}