import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Boj_12101 {
    static List<String> ans= new ArrayList<>();
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt();
        sum(1, "1");
        sum(2, "2");
        sum(3, "3");

        ans.sort(Comparator.naturalOrder());

        if(k>ans.size()) System.out.println(-1);
        else System.out.println(ans.get(k-1));
    }
    static void sum(int now, String sentence){
        if(now>n) return;
        if(now==n){
            ans.add(sentence);
            return;
        }
        for (int i = 1; i <= 3; i++) {
            sum(now+i, sentence+"+"+i);
        }
    }
}
