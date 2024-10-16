package Hashing;

import java.util.*;

public class ContainsDuplicate3
{
    //1 2 2 3 1
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeMap<Integer,Integer> treemap = new TreeMap<>();
        int lower=0,higher=0;
        for(int i=0;i<indexDiff;i++){
            treemap.put(nums[i],treemap.getOrDefault(nums[i],0)+1);}
        if(treemap.higherKey(nums[0])!=null)
           higher = treemap.higherKey(nums[0]);
        if(treemap.lowerKey(nums[0])!=null)
            lower = treemap.lowerKey(nums[0]);
        if(higher!=0&&(higher-nums[0])<=valueDiff) {return true;}
        if(lower!=0&&(nums[0]-lower)<=valueDiff) {return true;}
          for(int i=indexDiff+1;i<nums.length;i++){
              lower=0;
              higher=0;
              treemap.put(nums[i],treemap.getOrDefault(nums[i],0)+1);
              treemap.put(nums[i-indexDiff],treemap.get(nums[i-indexDiff])-1);
              if(treemap.get(nums[i-indexDiff])==0)
                  treemap.remove(nums[i-indexDiff]);
              if(treemap.higherKey(nums[i-indexDiff])!=null)
                  higher = treemap.higherKey(nums[i-indexDiff]);
              if(treemap.lowerKey(nums[i-indexDiff])!=null)
                  lower = treemap.lowerKey(nums[i-indexDiff]);
              if(higher!=0&&higher-nums[i-indexDiff]<=valueDiff) {return true;}
              if(lower!=0&&nums[i-indexDiff]-lower<=valueDiff) {return true;}
          }
          return false;
    }
}
