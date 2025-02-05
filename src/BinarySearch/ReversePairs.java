package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversePairs {
    public int reversePairs(int[] nums) {
        int count =0;
        List<Integer> sortedList = new ArrayList<Integer>();
        sortedList.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            int index = Collections.binarySearch(sortedList,2*nums[i]+1);
            if(index >= 0){
                count += sortedList.size() - index;
            }
            else if(-(index+1) < sortedList.size()){
                count += sortedList.size() - (-(index+1));
            }
            int indexOfElement = Collections.binarySearch(sortedList,nums[i]);
            if(indexOfElement >= 0)
                sortedList.add(indexOfElement,nums[i]);
            else if(-(indexOfElement+1) < sortedList.size()){
                sortedList.add(-(indexOfElement+1),nums[i]);
            }
        }
        return count;
    }
}
