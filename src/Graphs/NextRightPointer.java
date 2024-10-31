package Graphs;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class NextRightPointer {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Queue<Node> q1 = new LinkedList<>();
        Deque<Node> q2 = new LinkedList<>();
        while(q2.getLast() == null){
            q2.removeLast();
        }
        q1.add(root);
        while (!q1.isEmpty()) {
            System.out.println(q1);
            Node node = q1.poll();
            if (node != null) {
                if (q1.isEmpty()) {
                    node.right = null;
                } else {
                    node.right = q1.peek();
                }
                q1.add(node.left);
                q1.add(node.right);
            }
        }
        return root;
    }
}
