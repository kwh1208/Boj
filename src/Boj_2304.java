import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2304 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str;
        int[] arr = new int[1010];//배열 저장
        int[] l_r = new int[1010];//왼쪽에서 오른쪽으로 볼 누적합
        int[] r_l = new int[1010];//오른쪽에서 왼쪽으로 볼 누적합

        for (int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            int tmp = Integer.parseInt(str.nextToken());
            arr[tmp] = Integer.parseInt(str.nextToken());
        }

        for (int i = 1; i < 1010; i++) {//어떤 위치의 왼쪽에서 해당위치 기둥까지 제일 높은거를 누적합에 저장.
            l_r[i] = Math.max(l_r[i-1], arr[i]);
        }


        for (int i = 1008; i >=0; i--) {//어떤 위치의 오른쪽에서 해당위치 기둥까지 제일 높은거를 누적합에 저장.
            r_l[i] = Math.max(r_l[i+1], arr[i]);
        }

        long ans = 0;
        for (int i = 0; i < 1010; i++) {//왼쪽과 오른쪽에서 누적합 중에 작은 값 더하기.
            ans+=Math.min(l_r[i],r_l[i]);
        }

        System.out.println(ans);
    }
}
