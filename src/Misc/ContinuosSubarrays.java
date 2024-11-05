package Misc;

import java.util.Map;
import java.util.TreeMap;

public class ContinuosSubarrays
{
    //2762-continuous subarrays
    //https://leetcode.com/problems/continuous-subarrays/
    //Sliding Window and TreeMap
    public long continuousSubarrays(int[] nums)
    {
        TreeMap<Integer,Integer> numbers = new TreeMap<>();
        int l=0;
        int mx=nums[0],mn=nums[0];
        long count=0;

        for(int i=0;i<nums.length;i++)
        {
            if(!numbers.containsKey(nums[i]))
                numbers.put(nums[i],1);
            else
                numbers.put(nums[i],numbers.get(nums[i])+1);
            mn=numbers.firstKey();
            mx=numbers.lastKey();

            while(mx-mn>2)
            {
                numbers.put(nums[l],numbers.get(nums[l])-1);
                if(numbers.get(nums[l])==0)
                {
                    //System.out.println("$$");
                    numbers.remove(nums[l]);
                }
                l++;
                //System.out.println(l);
                mn=numbers.firstKey();
                mx=numbers.lastKey();
                //System.out.println(mx+"*"+mn);
            }
            //System.out.println("*****************************");
            for(Map.Entry<Integer,Integer> entry : numbers.entrySet())
            {
                int k = entry.getKey();
                int v = entry.getValue();
                //System.out.println(k+" "+v);
            }
            //System.out.println(l+" "+i);
            count+=i-l+1;
        }
        return count;
    }
}
