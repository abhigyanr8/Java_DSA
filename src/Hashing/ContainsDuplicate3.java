package Hashing;

import java.util.*;

public class ContainsDuplicate3
{
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        if(indexDiff>=nums.length){
            indexDiff = nums.length -1;
        }
        for(int i=1;i<=indexDiff;i++){
            treeMap.put(nums[i],treeMap.getOrDefault(nums[i],0)+1);
            System.out.println(nums[i]);
        }
        System.out.println(0);
        if(treeMap.containsKey(nums[0])) return true;
        if(treeMap.higherKey(nums[0])!=null){
            System.out.println("higher "+treeMap.higherKey(nums[0]));
            if(treeMap.higherKey(nums[0])-nums[0]<=valueDiff) return true;
        }
       if(treeMap.lowerKey(nums[0])!=null){
            System.out.println("lower "+treeMap.lowerKey(nums[0]));
            if(nums[0]-treeMap.lowerKey(nums[0])<=valueDiff) return true;
        }
        for(int i=indexDiff+1;i<nums.length;i++){
            treeMap.put(nums[i],treeMap.getOrDefault(nums[i],treeMap.getOrDefault(nums[i],0))+1);
            treeMap.put(nums[i-indexDiff],treeMap.get(nums[i-indexDiff])-1);
            if(treeMap.get(nums[i-indexDiff])==0)
                treeMap.remove(nums[i-indexDiff]);
            System.out.println(treeMap);
            System.out.println("result "+ (i-indexDiff));
            if(treeMap.containsKey(nums[i-indexDiff])) return true;
            if(treeMap.higherKey(nums[i-indexDiff])!=null){
                System.out.println("higher "+treeMap.higherKey(nums[i-indexDiff]));
                if(treeMap.higherKey(nums[i-indexDiff])-nums[i-indexDiff]<=valueDiff) return true;
            }
            if(treeMap.lowerKey(nums[i-indexDiff])!=null){
                System.out.println("lower "+treeMap.lowerKey(nums[i-indexDiff]));
                if(nums[i-indexDiff]-treeMap.lowerKey(nums[i-indexDiff])<=valueDiff) return true;
            }
        }
        return false;
    }
}
