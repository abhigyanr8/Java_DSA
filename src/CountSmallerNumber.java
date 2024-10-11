import java.util.*;

public class CountSmallerNumber {
        public List<Integer> countSmaller(int[] nums)
        {
            int i,index;
            List<Integer> sortedList = new ArrayList<>();
            List<Integer> count = new ArrayList<>();
            for(i=nums.length-1;i>=0;i--)
            {
                index = binaryInsert(sortedList,nums[i]);
                count.add(index);
                sortedList.add(index,nums[i]);
            }
            return count;
        }
        public int binaryInsert(List<Integer> sortedList,int element)
        {
            int l=0;
            int r=sortedList.size();
            int mid = l+(r-l)/2;
            int result=0;
            while(l<=r)
            {
                if(sortedList.get(mid)==element)
                {
                    result=mid;
                    r=mid-1;
                }
                else if(sortedList.get(mid)>element)
                {
                    r=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
            return result;
        }
}
