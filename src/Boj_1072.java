import java.util.*;
public class Boj_1072 {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        double Y1 = Y*100;
        double Z = (Y1/X);
        int Z1 = (int)Z;
        if(Z>=99) System.out.println(-1);
        else {
            double i = 0;
            while(true) {
                i++;
                if(((Y1+i*100)/(X+i))>=Z1+1) {System.out.printf("%.0f",i);break;}
            }}
    }
}