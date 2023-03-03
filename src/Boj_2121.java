import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Boj_2121 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeMap<Integer, HashSet<Integer>> dot = new TreeMap<>();
        StringTokenizer str = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(str.nextToken());
        int h = Integer.parseInt(str.nextToken());
        for (int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(str.nextToken());
            int y = Integer.parseInt(str.nextToken());
            if(dot.containsKey(x)){
                dot.get(x).add(y);
            }
            else {
                dot.put(x, new HashSet<>());
                dot.get(x).add(y);
            }
        }
        long cnt=0;
        for (Integer x : dot.keySet()) {
            for (Integer y : dot.get(x)) {
                if(dot.get(x).contains(y+h)//위의 점
                        && dot.containsKey(x-w)&&dot.get(x-w).contains(y)//왼쪽 점
                        && dot.get(x-w).contains(y+h)/*왼쪽위의점*/){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
