import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_13423 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            boolean[] dot = new boolean[200000001];
            int[] chk = new int[n];
            int cnt = 0;
            StringTokenizer str = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int tmp = Integer.parseInt(str.nextToken());
                chk[j]=tmp;
                dot[tmp+100000000] = true;
            }
            for (int j = 0; j < n; j++) {//기준점
                for (int k = 0; k < n; k++) {//확인할 점
                    if(j==k) continue;
                    int c=2*chk[j]-chk[k]+100000000;
                    if(c<=200000000&&c>=0){
                    if(dot[c]) {
                        cnt++;
                    }}
                }
            }
            sb.append(cnt/2).append("\n");
        }
        System.out.println(sb);

    }
}