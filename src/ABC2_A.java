import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ABC2_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer str = new StringTokenizer(br.readLine());
        boolean flag = false;
        while (str.hasMoreTokens()){
            String tmp = str.nextToken();
            if(tmp.equals("and")){
               flag = true;
               break;
            }
            if(tmp.equals("not")){
                flag = true;
                break;
            }
            if(tmp.equals("that")){
                flag = true;
                break;
            }
            if(tmp.equals("the")){
                flag = true;
                break;
            }
            if(tmp.equals("you")){
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("Yes");
        else System.out.println("No");

    }
}
