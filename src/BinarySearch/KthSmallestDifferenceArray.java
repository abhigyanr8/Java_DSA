package BinarySearch;

import java.util.Arrays;

public class KthSmallestDifferenceArray {

    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int maxDiff = nums[nums.length-1] - nums[0];
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i< nums.length-1 ; i++){
            if(nums[i+1] - nums[i] < minDiff)
                minDiff = nums[i+1] - nums[i];
        }
        System.out.println("minDiff" + minDiff);
        System.out.println("maxDiff" + maxDiff);
        while(minDiff <= maxDiff){
            int mid = minDiff + (maxDiff - minDiff)/2;
            System.out.println("mid "+mid);
            int k1 = findKforDiffd(nums , mid);
            System.out.println("k1 "+ k1);
//            if(k1 == k)
//                return mid;
            if(k1 >= k){
                maxDiff = mid-1;
            }
            else{
                minDiff = mid +1;
            }
        }
        return minDiff;
    }
    public int findKforDiffd(int[] nums, int d) {
        int count = 0;
        int j = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            while (j < nums.length && nums[j] - nums[i] <= d) {
                j++;
                System.out.println("j "+j);
            }
            count += j - i - 1;
        }
        return count;
    }
}

