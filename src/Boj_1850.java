import java.util.Scanner;

public class Boj_1850 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long gcd = gcd(a, b);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < gcd; i++) {
            sb.append(1);
        }
        System.out.println(sb);
    }
    public static long gcd(long A, long B){
        long A1 = Long.max(A, B);
        long B1 = Long.min(A, B);
        while (true){
            if(A1%B1==0) break;
            long tmp = B1;
            B1 = A1%B1;
            A1 = tmp;
        }
        return B1;
    }
}
