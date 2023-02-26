import java.util.Scanner;

public class Boj_9660 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n%7==2||n%7==0) System.out.println("CY");
        else System.out.println("SK");
    }
}
