import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Boj_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        int[] ans = new int[n];
        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(str.nextToken());
            num1.add(tmp);
            num2.add(tmp);
        }
        Collections.sort(num2);
        StringBuilder sb = new StringBuilder();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        int order = 0;
        for (int i = 0; i < n; i++) {
            int tmp = num2.get(i);
            if(!tm.containsKey(tmp)) {
                tm.put(tmp, order);
                order++;
            }
        }
        for (int i = 0; i < n; i++) {
            int tmp = num1.get(i);
            sb.append(tm.get(tmp)).append(" ");
        }
        System.out.println(sb);
    }
}
