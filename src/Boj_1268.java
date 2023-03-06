import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str;
        int[] one = new int[n];
        int[] two = new int[n];
        int[] three = new int[n];
        int[] four = new int[n];
        int[] five = new int[n];
        int[][] total = new int[n][n];
        for (int i = 0; i <n; i++) {
            str = new StringTokenizer(br.readLine());
            one[i]= Integer.parseInt(str.nextToken());
            two[i]= Integer.parseInt(str.nextToken());
            three[i]= Integer.parseInt(str.nextToken());
            four[i]= Integer.parseInt(str.nextToken());
            five[i]= Integer.parseInt(str.nextToken());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j) continue;
                if(one[i]==one[j]) {total[i][j]=1;}
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j) continue;
                if(two[i]==two[j]) {total[i][j]=1;}
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j) continue;
                if(three[i]==three[j]) {total[i][j]=1;}
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j) continue;
                if(four[i]==four[j]) {total[i][j]=1;}
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j) continue;
                if(five[i]==five[j]) {total[i][j]=1;}
            }
        }
        int ans = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                total[i][j+1]+=total[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            if(total[i][n-1]>max){ans=i;max=total[i][n-1];}
        }
        System.out.println(ans+1);
    }
}
