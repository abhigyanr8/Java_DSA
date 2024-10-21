import Hashing.ContainsDuplicate3;
import Hashing.KDifferentIntger;
import Hashing.KSizeSubarraysI;
import Hashing.minWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(new minWindow().minWindow("cabwefgewcwaefgcf","cae"));
        int[] test = new int[]{7,1,3};
        int[] result = new int[test.length];
//        System.out.println(new KDifferentIntger().subarraysWithKDistinct(test,2));
        System.out.println(new ContainsDuplicate3().containsNearbyAlmostDuplicate(test,2,3));
//        result = new KSizeSubarraysI().resultsArray(test,3);
//        for(int a : result){
//            System.out.print(a+" ");
//        }
    }
}