import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Boj_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeMap<String, Integer> tm = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            if(tm.containsKey(tmp))
                tm.replace(tmp, tm.get(tmp)+1);
            else tm.put(tmp, 1);
        }
        int max = 0;
        String ans = null;
        for (String s : tm.keySet()) {
            if(tm.get(s)>max){
                max = tm.get(s);
                ans = s;
            }
        }
        System.out.println(ans);
    }
}
