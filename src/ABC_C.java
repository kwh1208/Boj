import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class ABC_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        HashMap<Integer, HashSet<Integer>> dot = new HashMap<>();
        int now_x = 0;
        int now_y = 0;

        dot.put(now_x, new HashSet<>());
        dot.get(now_x).add(now_y);

        boolean ans = false;
        for (int i = 0; i < n; i++) {
            char tmp = s.charAt(i);
            if(tmp=='R') now_x++;
            if(tmp=='L') now_x--;
            if(tmp=='U') now_y++;
            if(tmp=='D') now_y--;
            if(dot.containsKey(now_x)){
                if(dot.get(now_x).contains(now_y)) {ans=true;break;}
                else dot.get(now_x).add(now_y);
            }
            else {
                dot.put(now_x, new HashSet<>());
                dot.get(now_x).add(now_y);
            }
        }

        if(ans) System.out.println("Yes");
        else System.out.println("No");
    }

}
