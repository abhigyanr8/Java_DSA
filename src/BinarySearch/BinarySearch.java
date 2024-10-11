package BinarySearch;

public class BinarySearch
{
    public int binarySearch(int[] a , int l,int r,int element)
    {
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(a[mid]==element)
                 return mid;
            if(a[mid]<element)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return -1;
    }
}
