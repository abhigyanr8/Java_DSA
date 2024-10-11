public class CeilOfAnElement
{
    public int ceilOfAnElement(int[] a,int element)
    {
        int l=0;
        int r=a.length-1;
        int result=-1;

        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(a[mid]>element)
            {
                result=a[mid];
                r=mid-1;
            }
            else {
                l=mid+1;
            }

        }
        return result;
    }
}
