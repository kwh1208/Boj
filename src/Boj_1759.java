import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_1759 {
    static int l;
    static int c;
    static char[] alphabet;
    static List<String> ans = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        l = Integer.parseInt(str.nextToken());
        c = Integer.parseInt(str.nextToken());

        String line = br.readLine();
        line = line.replace(" ", "");
        alphabet = new char[c];
        for (int i = 0; i < c; i++) {
            alphabet[i] = line.charAt(i);
        }
        Arrays.sort(alphabet);

        recur(0, 0, 0, "", 0);

        ans.sort(Comparator.naturalOrder());

        for (String s : ans) {
            System.out.println(s);
        }
    }

    private static void recur(int depth, int vowel, int consonant, String word, int select) {
        if(depth==c){
            if (select==l){
                if(vowel<1||consonant<2) return;
                ans.add(word);
            }
            return;
        }

        recur(depth+1, vowel, consonant, word, select);

        if(alphabet[depth]=='a'||alphabet[depth]=='e'||alphabet[depth]=='i'||alphabet[depth]=='o'||alphabet[depth]=='u'){
            recur(depth+1, vowel+1, consonant, word+alphabet[depth], select+1);
        }
        else recur(depth+1, vowel, consonant+1, word+alphabet[depth], select+1);
    }
}
