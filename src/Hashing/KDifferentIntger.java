package Hashing;

import java.util.HashMap;

public class KDifferentIntger {
    public int subarraysWithKDistinct(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int count=0;
        int l=0;
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            System.out.println("*");
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
//            System.out.println(mp.size());
//            System.out.println("map "+i+mp);
            while(mp.size()==k){
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
                count++;
                flag=true;
            }
            if(flag) {
                mp.remove(nums[i]);
                while (mp.size() == k) {
                    count++;
                    mp.put(nums[l], mp.get(nums[l]) - 1);
                    if (mp.get(nums[l]) == 0)
                        mp.remove(nums[l]);
                    l++;
                    System.out.println("*");
                }
                System.out.println("*");
            }
        }
        return count;
    }
}
