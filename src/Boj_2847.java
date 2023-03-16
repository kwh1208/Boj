import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2847 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        int pre = num[n-1];
        int ans = 0;
        for (int i = n-2; i >=0 ; i--) {
            if(num[i]>=pre){
                ans+=num[i]-pre+1;
                pre--;
            }
            else pre=num[i];
        }
        System.out.println(ans);
    }
}
