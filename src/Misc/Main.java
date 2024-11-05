package Misc;

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
        int[] test = new int[]{44,22,33,11,1};
//        System.out.println(new CapacityToShipPackagesWithinDDays().shipWithinDays(test,3));
//        System.out.println(new CapacityToShipPackagesWithinDDays().calculateDaysForGivenCapacity(test,9));
//        System.out.println(new MinimumOperationtoReduceXtoZero().minOperations(test,134365));
//        System.out.println(new UglyNumber3().nthUglyNumber(4,2,3,4));
//        System.out.println(new UglyNumber3().nthUglyNumber(1000000000,2,217983653,336916467));
//        System.out.println(new UglyNumber3().lcm(3,6));
//        System.out.println(new UglyNumber3().lcm(3,6,8));
//        System.out.println(new MedianOfUniqnessOfArray().medianOfUniquenessArray(test));
//        System.out.println(new MedianOfUniqnessOfArray().NumberOfSubarryshavingUniqueElementsLessthanN(test,10));
        System.out.println(new FindASmallDivisorGivenThresold().smallestDivisor(test,5));

    }
}