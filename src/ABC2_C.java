import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ABC2_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(str.nextToken());
            if(hm.containsKey(tmp)){
                hm.replace(tmp, hm.get(tmp)+1);
            }
            else hm.put(tmp, 1);
        }
        long ans = 0;
        for (Integer value : hm.values()) {
            ans+=value/2;
        }
        System.out.println(ans);
    }
}
