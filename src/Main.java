import BinarySearch.CountOfSmallerNumberAfterSelf;
import Graphs.MaximumWidthOfBinaryTree;
//import Graphs.NextRightPointer;
//import Hashing.ContainsDuplicate3;
//import Hashing.KDifferentIntger;
//import Hashing.KSizeSubarraysI;
//import Hashing.minWindow;
//import Graphs.Node;
import Graphs.TreeNode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(new minWindow().minWindow("cabwefgewcwaefgcf","cae"));
        int[] test = new int[]{5,2,6,1};
        int[] result = new int[test.length];
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.left = new TreeNode(3);
        List<Integer> rightList = new ArrayList<>();
        rightList.add(1);
        rightList.add(1);
        rightList.add(2);
        rightList.add(3);
        rightList.add(3);
        rightList.add(5);
        rightList.add(6);
        rightList.add(6);
        rightList.add(6);


//        Node node = new Node(1);
//        node.left = new Node(2);
//        node.right = new Node(3);
//        System.out.println("node -> right "+node.right);
//        System.out.println(new NextRightPointer().connect(node));
//        System.out.println("node " +node.next);
//        System.out.println("left -> next " +node.left.next);
//        System.out.println("right -> next " +node.right.next);
       // System.out.println(new MaximumWidthOfBinaryTree().widthOfBinaryTree(treeNode));
//        System.out.println(new KDifferentIntger().subarraysWithKDistinct(test,2));
      //  System.out.println(new ContainsDuplicate3().containsNearbyAlmostDuplicate(test,2,3));
//        result = new KSizeSubarraysI().resultsArray(test,3);
//        for(int a : result){
//            System.out.print(a+" ");
//        }
//        for(int x : test)
//            System.out.print(x+" ");
//        System.out.println();
       // System.out.println(new CountOfSmallerNumberAfterSelf().countSmaller(test));

        System.out.println(new CountOfSmallerNumberAfterSelf().countSmaller(test));
//        System.out.println(new CountOfSmallerNumberAfterSelf().findIndex(rightList,6));
//        System.out.println(new CountOfSmallerNumberAfterSelf().addInSortedList(rightList,5,4));
    }
}