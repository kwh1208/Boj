import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Boj_2900 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        long[] arr = new long[n];
        int k = Integer.parseInt(str.nextToken());
        str = new StringTokenizer(br.readLine());
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int i = 0; i < k; i++) {
            int tmp = Integer.parseInt(str.nextToken());
            if(tm.containsKey(tmp)) tm.replace(tmp, tm.get(tmp)+1);
            else tm.put(tmp, 1);
        }
        for (Integer i : tm.keySet()) {
            for (int j = 0; j < n; j+=i) {
                arr[j]+=tm.get(i);
            }
        }
        long[] prefix = new long[n+1];
        for (int i = 0; i < n; i++) {
            prefix[i+1]+=prefix[i]+arr[i];
        }
        int q = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            sb.append(prefix[b+1]-prefix[a]+"\n");
        }
        System.out.println(sb);
    }
}
