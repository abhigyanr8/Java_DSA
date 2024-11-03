package BinarySearch;

import java.util.Arrays;

public class MinimumOperationtoReduceXtoZero {
    public int minOperations(int[] nums, int x) {
        int maxSize = 0;
        int l=0;
        int sum =0;
        if(x > Arrays.stream(nums).sum())
            return -1;
        else if(x == Arrays.stream(nums).sum())
            return nums.length;
        int target = Arrays.stream(nums).sum() - x;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            while(sum > target){
                sum -= nums[l++];
            }
            if(sum == target)
            {
                maxSize = Math.max(maxSize , i-l+1);
            }
        }
        if(maxSize == 0)
            return -1;
        return nums.length-maxSize;
    }
}
