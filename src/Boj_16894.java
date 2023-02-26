import java.io.*;

public class Boj_16894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        int cnt = 0;
   loop:for (long i = 2; i*i <=n ; i++) {
            while (true){
                if(n%i==0) {
                    cnt++;
                    n/=i;
                    if(cnt>2) break loop;
                }
                else break;
            }
            if(cnt>2) break;
        }
        if(n!=1) cnt++;

        if(cnt==2) bw.write("cubelover");
        else bw.write("koosaga");
        bw.flush();
        bw.close();
    }
}
