import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] acid =new int[n];
        String s1 = br.readLine();
        StringTokenizer str1 = new StringTokenizer(s1);
        for (int i = 0; i < n; i++) {
            acid[i] = Integer.parseInt(str1.nextToken());
        }
        int s = 0;//앞에서 시작
        int e = n-1;//뒤에서 시작
        int dif = Integer.MAX_VALUE;
        int ans1 = 0;
        int ans2 = 0;
        while (true){
            if(s>=e) break;//중간에서 만나거나 서로 교차되면 끝.
            int sum = acid[s]+acid[e];
            if(Math.abs(sum)<dif) {dif = Math.abs(sum);ans1 = acid[s];ans2 = acid[e];}
            if(sum==0) break;
            else if (sum > 0) {//합이 크면 전체 수를 줄여줘야하므로 e를 한칸 땡겨줌.
                e--;
            }
            else {s++;}//합이 작으면 전체 수를 키워줘야하므로 s를 한칸 땡겨줌.

        }
        System.out.println(ans1+" "+ans2);
    }
}
