import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class Boj_11728_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        StringTokenizer str = new StringTokenizer(s);
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        int[] num1 = new int[n+m];
        String s1 = br.readLine();
        StringTokenizer str1 = new StringTokenizer(s1);
        for (int i = 0; i < n; i++) {
            num1[i] = Integer.parseInt(str1.nextToken());
        }
        String s2 = br.readLine();
        StringTokenizer str2 = new StringTokenizer(s2);
        for (int i = n; i < n+m; i++) {
            num1[i] = Integer.parseInt(str2.nextToken());
        }
        quicksort(num1);
        for (int i = 0; i < n+m; i++) {
            sb.append(num1[i]).append(" ");
        }
        System.out.println(sb);
    }
    public static void quicksort(int[] arr){
        quicksort(arr, 0, arr.length-1);
    }
    public static void quicksort(int[] arr, int start, int end){
        int part2 = partition(arr, start, end);
        if(start<part2-1){
            quicksort(arr, start, part2 - 1);
        }
        if (part2< end){
            quicksort(arr, part2, end);
        }
    }
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[(start+end)/2];
        while (start<=end){
            while (arr[start]<pivot) start++;
            while (arr[end]>pivot) end--;
            if(start<=end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }
    public static void swap(int[] arr, int start, int end){
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }
}
