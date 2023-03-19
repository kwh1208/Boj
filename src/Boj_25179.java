import java.util.Scanner;

public class Boj_25179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        if(N%(M+1)==1) System.out.println("Can't win");
        else System.out.println("Can win");
    }
}
