import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2082 {
    public static void main(String[] args) throws IOException {
        char[][] one = new char[5][3];
        char[][] two = new char[5][3];
        char[][] three = new char[5][3];
        char[][] four = new char[5][3];
        boolean[] one_ = new boolean[10];//false면 되는거, true면 안되는거
        boolean[] two_ = new boolean[10];
        boolean[] three_ = new boolean[10];
        boolean[] four_ = new boolean[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s =br.readLine();
            s = s.replaceAll(" ", "");
            for (int j = 0; j < 3; j++) {
                one[i][j] = s.charAt(j);
                two[i][j] = s.charAt(j+3);
                three[i][j] = s.charAt(j+6);
                four[i][j] = s.charAt(j+9);
            }
        }
        if(one[0][0]=='#') one_[1] = true;
        if(one[0][1]=='#') {one_[1] = true;one_[4]=true;}
        if(one[1][0]=='#') {one_[1] = true;one_[2] = true;one_[3] = true;one_[7] = true;}
        if(one[1][2]=='#') {one_[5] = true;one_[6] = true;}
        if(one[2][0]=='#') {one_[1] = true;one_[7] = true;}
        if(one[2][1]=='#') {one_[1] = true;one_[7]=true;one_[0] = true;}
        if(one[3][0]=='#') {one_[1] = true;one_[3] = true;one_[4] = true;one_[5] = true;one_[7] = true;one_[9] = true;}
        if(one[3][2]=='#') {one_[2] = true;}
        if(one[4][0]=='#') {one_[1] = true;one_[4] = true;one_[7] = true;}
        if(one[4][1]=='#') {one_[1] = true;one_[4] = true;one_[7] = true;}

        for (int i = 0; i < 10; i++) {
            if(!one_[i]) {System.out.print(i);break;}
        }
        if(two[0][0]=='#') two_[1] = true;
        if(two[0][1]=='#') {two_[1] = true;two_[4]=true;}
        if(two[1][0]=='#') {two_[1] = true;two_[2] = true;two_[3] = true;two_[7] = true;}
        if(two[1][2]=='#') {two_[5] = true;two_[6] = true;}
        if(two[2][0]=='#') {two_[1] = true;two_[7] = true;}
        if(two[2][1]=='#') {two_[1] = true;two_[7]=true;two_[0] = true;}
        if(two[3][0]=='#') {two_[1] = true;two_[3] = true;two_[4] = true;two_[5] = true;two_[7] = true;two_[9] = true;}
        if(two[3][2]=='#') {two_[2] = true;}
        if(two[4][0]=='#') {two_[1] = true;two_[4] = true;two_[7] = true;}
        if(two[4][1]=='#') {two_[1] = true;two_[4] = true;two_[7] = true;}

        for (int i = 0; i < 10; i++) {
            if(!two_[i]) {System.out.print(i);break;}
        }
        System.out.print(":");
        if(three[0][0]=='#') three_[1] = true;
        if(three[0][1]=='#') {three_[1] = true;three_[4]=true;}
        if(three[1][0]=='#') {three_[1] = true;three_[2] = true;three_[3] = true;three_[7] = true;}
        if(three[1][2]=='#') {three_[5] = true;three_[6] = true;}
        if(three[2][0]=='#') {three_[1] = true;three_[7] = true;}
        if(three[2][1]=='#') {three_[1] = true;three_[7]=true;three_[0] = true;}
        if(three[3][0]=='#') {three_[1] = true;three_[3] = true;three_[4] = true;three_[5] = true;three_[7] = true;three_[9] = true;}
        if(three[3][2]=='#') {three_[2] = true;}
        if(three[4][0]=='#') {three_[1] = true;three_[4] = true;three_[7] = true;}
        if(three[4][1]=='#') {three_[1] = true;three_[4] = true;three_[7] = true;}

        for (int i = 0; i < 10; i++) {
            if(!three_[i]) {System.out.print(i);break;}
        }
        if(four[0][0]=='#') four_[1] = true;
        if(four[0][1]=='#') {four_[1] = true;four_[4]=true;}
        if(four[1][0]=='#') {four_[1] = true;four_[2] = true;four_[3] = true;four_[7] = true;}
        if(four[1][2]=='#') {four_[5] = true;four_[6] = true;}
        if(four[2][0]=='#') {four_[1] = true;four_[7] = true;}
        if(four[2][1]=='#') {four_[1] = true;four_[7]=true;four_[0] = true;}
        if(four[3][0]=='#') {four_[1] = true;four_[3] = true;four_[4] = true;four_[5] = true;four_[7] = true;four_[9] = true;}
        if(four[3][2]=='#') {four_[2] = true;}
        if(four[4][0]=='#') {four_[1] = true;four_[4] = true;four_[7] = true;}
        if(four[4][1]=='#') {four_[1] = true;four_[4] = true;four_[7] = true;}

        for (int i = 0; i < 10; i++) {
            if(!four_[i]) {System.out.print(i);break;}
        }
    }
}
