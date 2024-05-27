package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class 길찾기게임 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[][]{{5,3},{11,5},{13,3},{3,5},{6,1},{1,3},{8,6},{7,2},{2,2}});
    }
    static class Solution {
        int[][] answer = {};
        int index = 0;
        public int[][] solution(int[][] nodeinfo) {
            answer = new int[2][nodeinfo.length];

            Node[] node = new Node[nodeinfo.length];
            for(int i = 0; i < nodeinfo.length; i++) {
                node[i] = new Node(nodeinfo[i][0], nodeinfo[i][1], i + 1, null, null);
            }
            Arrays.sort(node, new Comparator<Node>() {
                @Override
                public int compare(Node n1, Node n2) {
                    if(n1.y == n2.y) return n1.x - n2.x;
                    else return n2.y - n1.y;
                }
            });

            Node root = node[0];
            for(int i = 1; i < node.length; i++) {
                makeNode(root, node[i]);
            }

            preOrder(root); //전위 순회
            index = 0;
            postOrder(root);

            return answer;
        }

        private void makeNode(Node parent, Node child) {
            if(parent.x > child.x) {
                if(parent.left == null) parent.left = child;
                else makeNode(parent.left, child);
            } else {
                if(parent.right == null) parent.right = child;
                else makeNode(parent.right, child);
            }
        }

        private void preOrder(Node root) {
            if(root != null){
                answer[0][index++] = root.value;
                preOrder(root.left);
                preOrder(root.right);
            }
        }

        private void postOrder(Node root) {
            if(root != null){
                postOrder(root.left);
                postOrder(root.right);
                answer[1][index++] = root.value;
            }
        }


        public class Node {
            int x;
            int y;
            int value;
            Node left;
            Node right;

            public Node(int x, int y, int value, Node left, Node right) {
                this.x = x;
                this.y = y;
                this.value = value;
                this.left = left;
                this.right = right;
            }
        }
    }
}
