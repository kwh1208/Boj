import java.util.Scanner;

public class Boj_1735 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//첫번째 분자
        int b = sc.nextInt();// 첫번째 분모
        int c = sc.nextInt();// 두번째 분자
        int d = sc.nextInt();// 두번째 분모

        int A = a*d+b*c;
        int B = b*d;

        int gcd = gcd(A, B);
        A /= gcd;
        B /= gcd;
        System.out.println(A+" "+B);
    }
    public static int gcd(int A, int B){
        int A1 = Integer.max(A, B);
        int B1 = Integer.min(A, B);
        while (true){
            if(A1%B1==0) break;
            int tmp = B1;
            B1 = A1%B1;
            A1 = tmp;
        }
        return B1;
    }
}
