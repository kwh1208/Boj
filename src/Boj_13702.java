import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_13702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken()); //막걸리 개수
        int k = Integer.parseInt(str.nextToken()); //친구들수
        int[] alcohol = new int[n];
        for (int i = 0; i < n; i++) {
            alcohol[i] = Integer.parseInt(br.readLine());
        }
        long s = 0; //막걸리 최솟값
        long e = Integer.MAX_VALUE;// 막걸리 최대값.
        int ans = 0;
        while (true){
            if(s>e) break; //탈출 조건
            long mid = (s+e)/2;//mid 설정(막걸리 값)
            int cnt = 0; //각 막걸리를 mid로 나눴을때 몇개가 나오는지 확인할 값.
            for (int i = 0; i < n; i++) {
                cnt+=alcohol[i]/mid;
            }
            if(cnt>=k){
                //만약에 cnt가 친구들 수보다 같거나 크면 친구들이 모두 막걸리를 먹을수 있는거니까 ans에 저장하고 더 작은 값도 되는지 확인
                s=mid+1;
                ans= (int) mid;
            }
            else {
                // cnt가 친구들수보다 작으면 막걸리 용량을 줄여야되므로 e줄이기.
                e=mid-1;
            }
        }
        System.out.println(ans);
    }
}
