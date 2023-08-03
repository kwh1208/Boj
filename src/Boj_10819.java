import java.util.*;

public class Boj_10819 {
    static boolean[] visited;
    static int[] arr;
    static int n;
    static List<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            visited[i]=true;
            recur(1, 0, arr[i]);
            visited[i]=false;
        }
        ans.sort(Comparator.naturalOrder());
        System.out.println(ans.get(ans.size()-1));
    }

    private static void recur(int depth, int sum, int last) {
        if(depth==n){
            ans.add(sum);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]){
                visited[i] = true;
                recur(depth+1, sum+Math.abs(last-arr[i]), arr[i]);
                visited[i] = false;
            }
        }
    }
}
