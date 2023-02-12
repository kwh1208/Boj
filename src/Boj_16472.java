import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_16472 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s1 = br.readLine();
        char[] letter = new char[s1.length()];
        int[] num = new int[s1.length()];
        int[] alphabet = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            letter[i] = s1.charAt(i);
            num[i] = letter[i]-97;
        }
        int s = 0;
        int e = 1;
        int ans = 0;
        alphabet[num[0]]++;
        alphabet[num[1]]++;
        while (true){
            int chk = 0;
            for (int i = 0; i < 26; i++) {
                if(alphabet[i]!=0) chk++;
            }
            if(e-s+1>ans&&chk<=n) ans = e-s+1;
            if(s>=e||e==s1.length()-1&&chk<=n) break;
            if(chk<=n) {e++;alphabet[num[e]]++;}
            else {alphabet[num[s]]--;s++;}
        }
        System.out.println(ans);
    }
}
