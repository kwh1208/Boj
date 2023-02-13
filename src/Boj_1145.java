import java.util.Scanner;

import static java.lang.System.*;

public class Boj_1145 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
        first: for (int i = 1; i <= 1000000; i++) {
            int chk = 0;
            for (int j = 0; j < 5; j++) {
                if(i%num[j]==0) chk++;
                if(chk>=3) {
                    out.println(i);
                    break first;
                }
            }
        }
    }

}