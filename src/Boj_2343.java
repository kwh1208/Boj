import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        str = new StringTokenizer(br.readLine());
        int[] length = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            length[i] = Integer.parseInt(str.nextToken());
            if(length[i]>max) max = length[i];
        }
        int s = max;
        int e = 1000000000;
        while (s<=e){
            int mid = (s+e)/2;
            int tmp = 0;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if(tmp+length[i]<=mid){
                    tmp+=length[i];
                }
                else {
                    cnt++;
                    tmp = length[i];
                }
            }
            if(tmp!=0) cnt++;
            if(cnt > m){
                s = mid+1;
            }
            else {
                e = mid-1;
            }
        }
        System.out.println(s);

    }
}
