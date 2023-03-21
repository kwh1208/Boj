import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Boj_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> num = new ArrayList<>();
        StringTokenizer str = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            num.add(Integer.parseInt(str.nextToken()));
        }
        Collections.sort(num);//Collection을 이용하는게 정렬이 훨씬 빠릅니다.
        int m = Integer.parseInt(br.readLine());
        str = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int tmp = Integer.parseInt(str.nextToken());//내가 가지고 있는 카드인가?
            int s = 0; //첫번째 카드
            int e = n-1;//마지막 카드
            while (true){
                int mid = (s+e)/2;
                if(s>e) {sb.append(0).append(" ");break;}//다돌았는데 없네? 0 출력
                if(num.get(mid)==tmp) {sb.append(1).append(" ");break;}//가지고 있네? 1 출력
                if(num.get(mid)>tmp) {e=mid-1;continue;}// mid가 확인할 숫자보다 크네? mid가 작아져야겠군. -> e 줄여야됨.
                if(num.get(mid)<tmp) {s=mid+1;}// mid가 확인할 숫자보다 작군. mid가 커져야겠군 -> s 늘려야됨.
            }
        }
        System.out.println(sb);
    }
}
