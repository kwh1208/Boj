import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_20206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str  = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(str.nextToken());
        int b = Integer.parseInt(str.nextToken());
        int c = Integer.parseInt(str.nextToken());
        str  = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(str.nextToken());
        int x2 = Integer.parseInt(str.nextToken());
        int y1 = Integer.parseInt(str.nextToken());
        int y2 = Integer.parseInt(str.nextToken());
        //그래프에 x1, x2를 대입해서 나온 y좌표 값들이 모두 사각형 위쪽 혹은 아래쪽에 있으면 통과 X
        int y3, y4;
        if(b!=0){
            y3=-(a*x1+c)/b;//x1대입
            y4=-(a*x2+c)/b;//x2대입
            boolean flag = false;
            int up = Math.max(y1, y2);
            int down = Math.min(y1, y2);
            //위쪽인가?
            if(y3>=up&&y4>=up) flag = true;
            //아래쪽인가?
            if(y3<=down&&y4<=down) flag = true;
            if(flag) System.out.println("Lucky");
            else System.out.println("Poor");
        }
        else {
            int x = -c/a;
            if(Math.min(x1,x2)<x&&x<Math.max(x1,x2)) System.out.println("Poor");
            else System.out.println("Lucky");
        }


    }
}
