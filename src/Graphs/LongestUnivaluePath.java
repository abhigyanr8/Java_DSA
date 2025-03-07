package Graphs;

class LongestUnivaluePath {
    public int longestUnivaluePath(TreeNode root) {
        if(root == null)
            return 0;
        else if(root.left == null && root.right == null)
            return 0;
        else{
            if(root.left != null && root.val == root.left.val && root.right != null && root.val == root.right.val)
                return 2 + (longestUnivaluePath(root.left)+longestUnivaluePath(root.right));
            else if(root.left != null && root.val == root.left.val)
                return 1 + longestUnivaluePath(root.left);
            else if(root.right != null && root.val == root.right.val)
                return 1 + longestUnivaluePath(root.right);
            else
                return Math.max(longestUnivaluePath(root.left),longestUnivaluePath(root.right));
        }
    }
}
