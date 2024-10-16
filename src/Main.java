import Hashing.ContainsDuplicate3;
import Hashing.KDifferentIntger;
import Hashing.minWindow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(new minWindow().minWindow("cabwefgewcwaefgcf","cae"));
        int[] test = new int[]{1,2,2,3,1};
//        System.out.println(new KDifferentIntger().subarraysWithKDistinct(test,2));
        System.out.println(new ContainsDuplicate3().containsNearbyAlmostDuplicate(test,3,0));
    }
}