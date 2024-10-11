import java.util.TreeMap;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k)
    {
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        int[] result = new int[nums.length-(k-1)];
        int l=0;

        for(int i=0;i<nums.length;i++)
        {
            if(i<k)
            {
                //System.out.println("i<k");
                //  System.out.println(i);
                if(mp.containsKey(nums[i]))
                    mp.put(nums[i],mp.get(nums[i])+1);
                else
                    mp.put(nums[i],1);
                if(i==k-1)
                    result[l++]=mp.lastKey();

            }
            else
            {
                // System.out.println(i);
//                System.out.println(nums[i-k]);
                mp.put(nums[i-k],mp.get(nums[i-k])-1);
                if(mp.get(nums[i-k])==0)
                    mp.remove(nums[i-k]);
                if(mp.containsKey(nums[i]))
                    mp.put(nums[i],mp.get(nums[i])+1);
                else
                    mp.put(nums[i],1);
                result[l++]=mp.lastKey();
            }
        }
        return result;
    }
}
