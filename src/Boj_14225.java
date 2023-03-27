import java.util.Scanner;
import java.util.TreeSet;

public class Boj_14225 {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int[] num = new int[n];
    static TreeSet<Integer> tm = new TreeSet<>();
    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        sum(0, 0);
        for (int i = 1; i < 2000000; i++) {
            if(!tm.contains(i)) {
                System.out.println(i);
                break;
            }
        }
    }
    public static void sum(int cnt, int total){
        if(cnt==n) {
            tm.add(total);
            return;
        }
        sum(cnt+1, total);
        sum(cnt+1, total+num[cnt]);

    }
}
