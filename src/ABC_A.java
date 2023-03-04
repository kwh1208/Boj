import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] letter = new char[s.length()];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            letter[i] = s.charAt(i);
            if(65<=letter[i]&&letter[i]<=90) {
                ans = i;
                break;
            }
        }
        System.out.println(ans+1);
    }
}
