import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str;
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            String tmp = str.nextToken();
            if(tmp.equals("push")){
                int k = Integer.parseInt(str.nextToken());
                st.push(k);
            }
            if(tmp.equals("pop")){
                if(!st.empty()) sb.append(st.pop()).append("\n");
                else sb.append(-1).append("\n");
            }
            if(tmp.equals("size")){
                sb.append(st.size()).append("\n");
            }
            if(tmp.equals("empty")){
                if(st.empty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
            if(tmp.equals("top")){
                if(!st.empty()) sb.append(st.peek()).append("\n");
                else sb.append(-1).append("\n");
            }
        }
        System.out.println(sb);
    }
}
