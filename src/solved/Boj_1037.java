package solved;

import java.util.*;

public class Boj_1037 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] M = new int[N];
        int num;
        for(int i=0;i<N;i++){
            M[i] = input.nextInt();
        }
        Arrays.sort(M);
        if(N==1) num = M[0] * M[0];
        else num = M[0] * M[N-1];
        System.out.println(num);





    }}