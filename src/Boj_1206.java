import java.util.Scanner;

public class Boj_1206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] per = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = (int)(sc.nextDouble()*1000);
        }
        for (int i = 0; i < n; i++) {
     loop:  for (int j = 1; j <= 1000; j++) {
                for (int k = 0; k <= j; k++) {
                    if(k*1000/j==num[i]){
                        per[i] = j;
                        break loop;
                    }
                }
            }
        }
        int lcm = per[0];
        for (int i = 1; i < n; i++) {
            lcm = lcm*per[i]/gcd(lcm, per[i]);
        }
        System.out.println(lcm);

    }
    public static int gcd(int a, int b){
        int a1 = Math.max(a, b);
        int b1 = Math.min(a, b);
        while (true){
            if(a1%b1==0) break;
            int tmp = b1;
            b1 = a1%b1;
            a1 = tmp;
        }
        return b1;
    }
}
