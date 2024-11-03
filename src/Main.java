import BinarySearch.*;
import BinarySearch.KokoEatingBananas;
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
        int[] test = new int[]{8828,9581,49,9818,9974,9869,9991,10000,10000,10000,9999,9993,9904,8819,1231,6309};
//        System.out.println(new CapacityToShipPackagesWithinDDays().shipWithinDays(test,3));
//        System.out.println(new CapacityToShipPackagesWithinDDays().calculateDaysForGivenCapacity(test,9));
        System.out.println(new MinimumOperationtoReduceXtoZero().minOperations(test,134365));
    }
}