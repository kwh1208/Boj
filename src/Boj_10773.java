import java.util.ArrayList;
import java.util.Scanner;

public class Boj_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long total = 0;
        int tmp;
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            tmp = sc.nextInt();
            if(tmp!=0) num.add(tmp);
            else num.remove(num.size()-1);
        }
        for (Integer i : num) {
            total+=i;
        }
        System.out.println(total);
    }
}
