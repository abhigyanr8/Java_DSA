import BinarySearch.CountOfSmallerNumberAfterSelf;
import BinarySearch.KokoEatingBananas;
import BinarySearch.KthSmallestDifferenceArray;
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
        int[] test = new int[]{805306368,805306368,805306368};
//        int[] sortedDiff = new int[3];
//        int index =0;
//        Arrays.sort(test);
//        for(int i=0 ; i<test.length ; i++){
//            for(int j= i+1 ; j<test.length ; j++){
//                sortedDiff[index++] = test[j] - test[i] ;
//            }
//        }
//        Arrays.sort(sortedDiff);
//        for(int i=0 ;i<sortedDiff.length ;i++){
//                System.out.println(sortedDiff[i]);
//        }
//        System.out.println(new KthSmallestDifferenceArray().smallestDistancePair(test,2));
//        System.out.println("methode result " + new KthSmallestDifferenceArray().findKforDiffd(test,67));
//        System.out.println(new KokoEatingBananas().minEatingSpeed(test,8));

        System.out.println(new KokoEatingBananas().minEatingSpeed(test,1000000000));
//        System.out.println(test[3] % 6);
    }
}