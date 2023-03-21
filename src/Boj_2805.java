import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Boj_2805 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());

        int[] tree = new int[N];

        int max = 0;

        str = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(str.nextToken());
            max=Math.max(max, tree[i]);//e가 될 부분 저장.
        }
        int s = 0;
        int e = max;

        while(true) {
            if(s>e) break;
            int mid = (s+e) / 2;
            long sum = 0;
            for(int h : tree) {
                if(h > mid) {
                    sum += (h - mid);//나무마다 mid보다 큰부분은 잘라갈거임.
                }
            }
            //조건 확인
            if(sum < M) {
                e = mid-1;
            }
            else {
                s = mid + 1;
            }
        }

        System.out.println(s-1);

    }
}