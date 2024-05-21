package programmers;

import java.util.Deque;
import java.util.LinkedList;

public class 크레인인형뽑기게임 {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        Solution solution = new Solution();
        System.out.println(solution.solution(board, moves));
    }
    static class Solution {
        public int solution(int[][] board, int[] moves) {
            Deque<Integer> result = new LinkedList<>();
            result.add(0);
            int ans = 0;
            for (int move : moves) {
                int line = move - 1;
                int now = -1;
                for (int j = 0; j < board.length; j++) {
                    if (board[j][line] != 0) {
                        now = board[j][line];
                        board[j][line] = 0;
                        break;
                    }
                }
                if (now == -1) {
                    continue;
                }
                Integer prev = result.peekLast();
                if (now == prev) {
                    result.pollLast();
                    ans+=2;
                } else {
                    result.add(now);
                }
            }
            return ans;
        }
    }
}
