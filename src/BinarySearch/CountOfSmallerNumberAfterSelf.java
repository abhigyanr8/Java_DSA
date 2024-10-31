//https://leetcode.com/problems/count-of-smaller-numbers-after-self/
package BinarySearch;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountOfSmallerNumberAfterSelf
{
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> rightList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        rightList.add(nums[nums.length-1]);
        result.add(0);
        for(int i=nums.length-2;i>=0;i--){
            int index = findIndex(rightList,nums[i]);
//            System.out.println(index);
            result.add(index);
            rightList.add(index , nums[i]);
//            System.out.println(rightList);
        }
        Collections.reverse(result);
        return result;
    }
    public int findIndex(List<Integer> rightList , int element){
        if(rightList.getFirst() >= element)
            return 0;
        if(rightList.getLast() < element)
            return rightList.size();
        int l=0;
        int r=rightList.size()-1;
        int mid;
        while(l <= r){
            mid = l +(r-l)/2 ;
            if(rightList.get(mid) < element && rightList.get(mid +1) >= element){
                return mid+1;
            }
            else if(rightList.get(mid) < element){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return l;
    }
}