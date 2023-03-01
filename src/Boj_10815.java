import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Boj_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> num = new ArrayList<>();
        StringTokenizer str = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            num.add(Integer.parseInt(str.nextToken()));
        }
        Collections.sort(num);
        int m = Integer.parseInt(br.readLine());
        str = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int tmp = Integer.parseInt(str.nextToken());
            int s = 0;
            int e = n-1;
            while (true){
                int mid = (s+e)/2;
                if(s>e) {sb.append(0).append(" ");break;}
                if(num.get(mid)==tmp) {sb.append(1).append(" ");break;}
                if(num.get(mid)>tmp) {e=mid-1;continue;}
                if(num.get(mid)<tmp) {s=mid+1;}
            }
        }
        System.out.println(sb);
    }
}
