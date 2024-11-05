package Misc;

import java.util.Arrays;

public class DeleteNodesFromLinkedListPresentInArray
{
    public ListNode modifiedList(int[] nums, ListNode head) {
        Arrays.sort(nums,0,nums.length);
        int val ;
        while(head.next!=null)
        {
            val = head.next.val;
            if(Arrays.binarySearch(nums,val)>=0)
            {
                head.next=head.next.next;
            }
            else
            {
                head=head.next;
            }

        }
        return head;
    }
}
