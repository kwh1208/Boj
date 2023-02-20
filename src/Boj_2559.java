import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int k = Integer.parseInt(str.nextToken());

        int[] tem = new int[n];//온도를 받을 배열
        int[] prefix = new int[n+1];//누적합 저장할 배열

        str = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            tem[i] = Integer.parseInt(str.nextToken());//온도 저장
            prefix[i+1] = prefix[i]+tem[i];//누적합 저장
        }

        int ans = Integer.MIN_VALUE;//답

        for (int i = 0; i < n-k+1; i++) {//i가 n-k이면 prefix[i+k]==prefix[n]이므로 여기까지만 돌아야됨.
            int tmp = prefix[i+k]-prefix[i];
            if(tmp>ans) {ans=tmp;}
        }
        System.out.println(ans);
    }
}
