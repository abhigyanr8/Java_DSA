public class NoOfRotaions
{
    public int noOfRotation(int[] a)
    {
        if(a[0]<a[a.length-1])
            return 0;
        else if(a[0]>a[a.length-1]&&a[a.length-2]>a[a.length-1])
            return a.length-1;
        int l=0,r=a.length-1;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(a[mid]<a[mid-1]&&a[mid]<a[mid+1])
            {
                System.out.println("found");
                return mid;
            }
            else {
                if(a[mid]<a[r])
                {
                    r=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
        }
        return -1;
    }
}
