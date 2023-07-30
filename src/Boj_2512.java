import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] budget = new int[n];
        StringTokenizer str = new StringTokenizer(br.readLine());
        int sum = 0;
        int max_budget = 0;
        for (int i = 0; i < n; i++) {
            budget[i] = Integer.parseInt(str.nextToken());
            sum+=budget[i];
            if(max_budget<budget[i]){
                max_budget = budget[i];
            }
        }
        int total = Integer.parseInt(br.readLine());
        if (sum<=total){
            System.out.println(max_budget);
        }
        else {
        int s = 1;
        int e = 100000;
        int max = 0;
        while (true){
            int mid = (s+e)/2;
            int tmp = 0;
            for (int i = 0; i < n; i++) {
                if(budget[i]>=mid) tmp+=mid;
                else tmp+=budget[i];
            }
            if(tmp<=total) {//통과됨 -> mid가 커져야됨.
                max = mid;
                s = mid+1;
            }
            else {
                e = mid-1;
            }
            if(s>=e) break;
        }
        System.out.println(max);
    }}
}
