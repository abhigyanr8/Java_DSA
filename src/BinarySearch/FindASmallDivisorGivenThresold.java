package BinarySearch;

import java.util.Arrays;

public class FindASmallDivisorGivenThresold {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = Arrays.stream(nums).max().orElseThrow();
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int result = 0;
            for (int i = 0; i < nums.length; i++) {
                result += (nums[i] + (mid - 1)) / mid;
            }
            if (result <= threshold) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
