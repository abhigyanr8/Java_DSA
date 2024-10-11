public class FirstOccurence
{
    public int firstOccurence(int[] a ,int element)
    {
        element--;
        int index=-1;
        int l=0;
        int r=a.length-1;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(a[mid]>element)
            {
                index=mid;
                r=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        return index;
    }
}
