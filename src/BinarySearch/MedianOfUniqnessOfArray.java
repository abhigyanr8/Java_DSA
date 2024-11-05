package BinarySearch;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;

public class MedianOfUniqnessOfArray {
    public int medianOfUniquenessArray(int[] nums) {
        long totalCount = ((long) nums.length * (nums.length + 1)) / 2;
        int l = 1;
        int r = (int) Arrays.stream(nums).distinct().count();
        long count = 0;
        int mid = 1;
        while (l <= r) {
            mid = l + (r - l) / 2;
            count = NumberOfSubarryshavingUniqueElementsLessthanN(nums, mid);
            if (count >= (totalCount - 1) / 2) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public long NumberOfSubarryshavingUniqueElementsLessthanN(int[] nums, int n) {
        int l = 0;
        long count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
            while (hashMap.size() > n) {
                hashMap.put(nums[l], hashMap.get(nums[l]) - 1);
                if (hashMap.get(nums[l]) == 0) hashMap.remove(nums[l]);
                l++;
            }
            count += (i - l) + 1;
        }
        return count - 1;
    }
}
