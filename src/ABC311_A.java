import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC311_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String line = br.readLine();

        boolean[] abc = new boolean[3];

        int ans = 0;
        loop: for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'A') abc[0] = true;

            if (line.charAt(i) == 'B') abc[1] = true;

            if (line.charAt(i) == 'C') abc[2] = true;

            for (int j = 0; j <3; j++) {
                if(!abc[j]) continue loop;
            }
            ans = i+1;
            break;
        }
        System.out.println(ans);
    }
}
