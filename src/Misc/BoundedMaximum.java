package Misc;

import java.util.TreeMap;

public class BoundedMaximum
{
    public int numSubarrayBoundedMax(int[] nums, int left, int right)
    {
        TreeMap<Integer,Integer> tree_map = new TreeMap<>();

        int l=0;
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            if(tree_map.containsKey(nums[i]))
                tree_map.put(nums[i],tree_map.get(nums[i])+1);
            else
                tree_map.put(nums[i],1);
            System.out.println(tree_map.lastKey());
//            while(tree_map.lastKey()>right || tree_map.lastKey()<left)
//            {
//                System.out.println("*");
//                tree_map.clear();
//                if(tree_map.containsKey(nums[i]))
//                    tree_map.put(nums[i],tree_map.get(nums[i])+1);
//                else
//                    tree_map.put(nums[i],1);
//
//                l=i;
//            }
            if(tree_map.lastKey() <= right)
            {
                count+=i-l;
            }
            else if(tree_map.lastKey()>=left && tree_map.lastKey()<=right)
            {
                count+=i-l+1;
            }
        }
        return count;
    }
}
