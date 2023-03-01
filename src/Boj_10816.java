import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Boj_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> num = new ArrayList<>();
        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num.add(Integer.valueOf(str.nextToken()));
        }
        Collections.sort(num);
        int m = Integer.parseInt(br.readLine());
        str = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int tmp = Integer.parseInt(str.nextToken());
            int s = 0;
            int e = n-1;
            int l = 500000;
            int r = -1;
            while (true){//왼쪽
                if(s>e) break;
                int mid = (s+e)/2;
                if(num.get(mid)<tmp) {s=mid+1;continue;}
                if(num.get(mid)>tmp) {e=mid-1;continue;}
                if(num.get(mid)==tmp) {
                    l=Math.min(l,mid);
                    e=mid-1;
                }
            }
            s = 0;
            e = n-1;
            while (true){//오른쪽
                if(s>e) break;
                int mid = (s+e)/2;
                if(num.get(mid)>tmp) {e=mid-1;continue;}
                if(num.get(mid)<tmp) {s=mid+1;continue;}
                if(num.get(mid)==tmp) {
                    r=Math.max(mid, r);
                    s=mid+1;
                }
            }
            if(l!=500000){
                int length = r-l+1;
                sb.append(length).append(" ");
            }
            else sb.append(0).append(" ");
        }
        System.out.println(sb);
    }
}
