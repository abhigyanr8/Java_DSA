import java.util.Arrays;

public class KokoEatingBananas
{
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int i=piles[0];
        int j=piles[piles.length-1];
        if(piles.length==1)
        {
            i=0;
            j=piles[0];
        }
        int mid = (i+j)/2;
        int result=0;
        boolean flag=false;
        int minMid = Integer.MAX_VALUE;
        while(i<=j)
        {
            result=0;
            mid = (i+j)/2;
            System.out.println(i+" "+j);
            for(int k=0;k<piles.length;k++)
            {
                if(piles[k]%mid==0)
                    result+=piles[k]/mid;
                else
                    result+=(piles[k]/mid)+1;
            }
            if(result<=h)
            {
                minMid = Math.min(minMid,mid);
            }
            if(result>h)
            {
                System.out.println("*");

                i=mid+1;
            }
            else{
                System.out.println("#");

                j=mid-1;
            }
        }
        return minMid;
    }
}
