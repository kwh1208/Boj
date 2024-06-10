package programmers.JUNE;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class 표현가능한이진트리 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution(new long[]{7, 42, 5});
        for (int i = 0; i < solution1.length; i++) {
            System.out.print(solution1[i]+" ");
        }
    }
    static class Solution {
        public int[] solution(long[] numbers) {
            int[] answer = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                if (canFormFullBinaryTree(numbers[i])) answer[i] = 1;
                else answer[i] = 0;
            }
            return answer;
        }
        private static boolean canFormFullBinaryTree(long num){
            String binaryStr = Long.toBinaryString(num);
            int len = binaryStr.length();

            int fullTreeSize = 1;
            while (fullTreeSize <= len) {
                fullTreeSize = fullTreeSize * 2;
            }
            fullTreeSize = fullTreeSize - 1;

            while (binaryStr.length() < fullTreeSize) {
                binaryStr = "0" + binaryStr;
            }
            HashMap<Integer, Node> nodes = new HashMap<>();
            for (int i = 0; i < binaryStr.length(); i++) {
                int cnt = divineTimes(i+1);
                if ((i+1)%2==0){
                nodes.put(i+1, new Node(i+1-(int)Math.pow(2, cnt-1), i+1+(int)Math.pow(2, cnt-1)));}
                else{
                    nodes.put(i+1, new Node(0, 0));
                }
            }

            for (int i = 0; i < binaryStr.length(); i++) {
                if (binaryStr.charAt(i) == '0') {
                    Queue<Integer> q = new LinkedList<>();
                    q.add(i+1);
                    while (!q.isEmpty()) {
                        Integer now = q.poll();
                        if(now==0) continue;
                        Node node = nodes.get(now);
                        int left = node.left;
                        int right = node.right;
                        q.add(left);
                        q.add(right);
                        if (left!=0&&right!=0) {
                            if (binaryStr.charAt(left-1)=='1'){
                                return false;
                            }
                            if (binaryStr.charAt(right-1)=='1'){
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
        private static int divineTimes(int num){
            int cnt = 0;
            while (true){
                if (num%2==0){
                    cnt++;
                    num/=2;
                }
                else return cnt;
            }
        }
        static class Node{
            public Node(int left, int right) {
                this.left = left;
                this.right = right;
            }

            int left;
            int right;
        }
    }
}