package BinarySearch;

public class NextAlphabeticalElement
{
    public char nextAlphabeticalElement(char[] a,char ch)
    {
        int l=0;
        int r=a.length-1;
        char result='0';

        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(a[mid]>ch)
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
