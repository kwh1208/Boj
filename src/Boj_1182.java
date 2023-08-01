import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Boj_1182 {
    static HashMap<Integer, Integer> ans = new HashMap<>();
    static int[] num;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        n = Integer.parseInt(str.nextToken());
        int s = Integer.parseInt(str.nextToken());
        str = new StringTokenizer(br.readLine());
        num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(str.nextToken());
        }

        recur(0, 0, 0);

        System.out.println(ans.get(s));

    }

    private static void recur(int depth, int sum, int select) {
        if(depth==n){
            if(select==0) return;
            if (!ans.containsKey(sum)){
                ans.put(sum, 1);
            }
            else ans.replace(sum, ans.get(sum)+1);
            return;
        }

        recur(depth+1, sum, select);

        recur(depth+1, sum+num[depth], select+1);
    }
}
