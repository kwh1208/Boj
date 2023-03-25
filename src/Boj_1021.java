import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj_1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> dq = new LinkedList<>();
        int cnt = 0;
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        int[] num = new int[m];
        for (int i = 1; i <= n; i++) {
            dq.offer(i);
        }
        str = new StringTokenizer(br.readLine());
        for (int i = 0; i <m; i++) {
            num[i] = Integer.parseInt(str.nextToken());
        }
        for (int i = 0; i < m; i++) {
            int tmp = dq.indexOf(num[i]);
            int chk;
            if(dq.size()%2==0){
                chk = dq.size()/2-1;
            }
            else chk = dq.size()/2;

            if(tmp<=chk){
                for (int j = 0; j < tmp; j++) {
                    dq.offerLast(dq.pollFirst());
                    cnt++;
                }
            }
            else {
                for (int j = 0; j < dq.size() - tmp; j++) {
                    dq.offerFirst(dq.pollLast());
                    cnt++;
                }
            }
            dq.pollFirst();


        }
        System.out.println(cnt);
    }
}
