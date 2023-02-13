package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.System.*;

public class Boj_11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String s = br.readLine();
        StringTokenizer str = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        int[] num1 = new int[n];
        int[] num2 = new int[m];
        String s1 = br.readLine();
        StringTokenizer str1 = new StringTokenizer(s1);
        for (int i = 0; i < n; i++) {
            num1[i] = Integer.parseInt(str1.nextToken());
        }
        String s2 = br.readLine();
        StringTokenizer str2 = new StringTokenizer(s2);
        for (int i = 0; i < m; i++) {
            num2[i] = Integer.parseInt(str2.nextToken());
        }
        Arrays.sort(num1);
        Arrays.sort(num2);
        int start_1 = 0;
        int start_2 = 0;
        int now = 0;
        int chk = 0;
        while (true){
            if(num1[start_1] >= num2[start_2]) {now = num2[start_2];start_2++;}
            else {now = num1[start_1];start_1++;}
            sb.append(now+" ");
            if(start_1==n) {chk = 1;break;}
            if(start_2==m) {chk = 2;break;}
        }
        if(chk==1) {for (int i = start_2; i < m; i++) {
            sb.append(num2[i]+" ");
        }}
        if(chk==2) {for (int i = start_1; i < n; i++) {
            sb.append(num1[i]+" ");
        }}
        System.out.println(sb);
        }


    }
