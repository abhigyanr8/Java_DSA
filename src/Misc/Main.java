package Misc;

import BinarySearch.*;
import BinarySearch.KokoEatingBananas;
import Graphs.*;
//import Graphs.NextRightPointer;
//import Hashing.ContainsDuplicate3;
//import Hashing.KDifferentIntger;
//import Hashing.KSizeSubarraysI;
//import Hashing.minWindow;
//import Graphs.Node;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] test = new int[]{1,1,1,1,1,1,999,999,999,999,999};
        int[] heaters = new int[]{499,500,501};
        char[][] grid = {{'1','1','1','1','0'}, {'1','1','0','1','0'}, {'1','1','0','0','0'},{'0','0','0','0','0'}};
//        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        int[][] test1 = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0,},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        int[][] test2= {{2,1}};


//        System.out.println(new CapacityToShipPackagesWithinDDays().shipWithinDays(test,3));
//        System.out.println(new CapacityToShipPackagesWithinDDays().calculateDaysForGivenCapacity(test,9));
//        System.out.println(new MinimumOperationtoReduceXtoZero().minOperations(test,134365));
//        System.out.println(new UglyNumber3().nthUglyNumber(4,2,3,4));
//        System.out.println(new UglyNumber3().nthUglyNumber(1000000000,2,217983653,336916467));
//        System.out.println(new UglyNumber3().lcm(3,6));
//        System.out.println(new UglyNumber3().lcm(3,6,8));
//        System.out.println(new MedianOfUniqnessOfArray().medianOfUniquenessArray(test));
//        System.out.println(new MedianOfUniqnessOfArray().NumberOfSubarryshavingUniqueElementsLessthanN(test,10));
//        System.out.println(new FindASmallDivisorGivenThresold().smallestDivisor(test,5));
//        System.out.println(new Heaters().findRadius(test,heaters));
//        System.out.println(new NumberOfIslands().numIslands(grid));
//          new SurroundedRegions().solve(board);
//        System.out.println(new MaxAreaIsland().maxAreaOfIsland(test1));
//        System.out.println(new WordSearch().exist(board,"ABCCED"));
        System.out.println(new LongestPathInMatrix().longestIncreasingPath(test2));
    }
}