import java.util.*;
import java.math.*;
public class Boj_1105 {
    static Scanner sc =  new Scanner(System.in);
    static int L = sc.nextInt();
    static int R = sc.nextInt();
    public static void main(String[] args) throws Exception {
        int min = 10;
        for(int i = L;i<=R;i++){
            int k = check(i);
            if(k==0) {min = k;break;}
            if(k<min) min = k;
        }
        System.out.print(min);
    }
    static int check(int i){
        int count = 0;
        while(i!=0){
            if(i%10==8) count++;
            i = i/10;
        }
        return count;
    }
}