import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_16955 {
    static char[][] omok = new char[10][10];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String s = br.readLine();
            for (int j = 0; j < 10; j++) {
                omok[i][j] = s.charAt(j);
            }
        }
        boolean ans = false;
   loop:for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(omok[i][j]=='X') ans = chk(i, j);
                if(ans) break loop;
            }
        }
        if(ans) System.out.println(1);
        else System.out.println(0);
    }
    public static boolean chk(int i, int j){
        //↖ ↗ ↘ ↙ ← → ↑ ↓
        int[] dx = {-1, 1, 1, -1, -1, 1, 0, 0};
        int[] dy = {-1, -1, 1, 1, 0, 0, -1, 1};
        for (int k = 0; k < 8; k++) {
            int i_copy = i;
            int j_copy = j;
            int X = 0;
            int dot = 0;
            for (int l = 0; l < 5; l++) {
                if(i_copy<0||i_copy>9||j_copy<0||j_copy>9) break;
                if(omok[i_copy][j_copy]=='X') X++;
                if(omok[i_copy][j_copy]=='.') dot++;
                i_copy = i_copy-dx[k];
                j_copy = j_copy-dy[k];
            }
            if(X==4&&dot==1) return true;
        }
        return false;
    }
}
