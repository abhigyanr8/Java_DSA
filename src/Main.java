import BinarySearch.CapacityToShipPackagesWithinDDays;
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
        int[] test = new int[]{3,3,3,3,3,3};
//        System.out.println(new CapacityToShipPackagesWithinDDays().shipWithinDays(test,3));
        System.out.println(new CapacityToShipPackagesWithinDDays().calculateDaysForGivenCapacity(test,9));
    }
}