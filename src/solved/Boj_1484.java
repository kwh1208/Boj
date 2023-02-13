package solved;

import java.util.Scanner;

public class Boj_1484 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int G = sc.nextInt();
        boolean chk = false;
        int s = 1;
        int e = 2;
        while (s != 50001) {
            int dif = e * e - s * s;
            if (dif == G) {
                System.out.println(e);
                chk = true;
                e++;
                continue;
            }
            if (dif > G) {
                s++;
            } else if (dif < G) {
                e++;
            }
        }
        if(!chk) System.out.println(-1);
    }
}
