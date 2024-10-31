package Graphs;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumWidthOfBinaryTree
{
    public int widthOfBinaryTree(TreeNode root){
        if(root == null) return 0;
        Deque<TreeNode> deque = new LinkedList<>();
        int maxLength = 0;
        deque.addLast(root);
        System.out.println("Hi from dequeue " +deque.getLast().toString());
        while(!deque.isEmpty()){
            while(deque.getLast() == null){
                System.out.println("Hello from deque.getLst() ");
                deque.removeLast();
            }
            maxLength = Math.max(maxLength,deque.size());
            TreeNode treeNode = deque.poll();
            if(treeNode != null){
                deque.addLast(treeNode.left);
                deque.addLast(treeNode.right);
            }
        }
        return maxLength;
    }
}
