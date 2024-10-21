package Hashing;

public class KSizeSubarraysI
{
    //3,2,3,2,3,2
    public int[] resultsArray(int[] nums, int k) {
        if(k==1)
            return nums;
        int l=0,index=0;
        int maxIndexNotValid=0;
        int[] result = new int[nums.length+1-k];
        for(int i=1;i<k;i++){
            if(!(nums[i-1]+1==nums[i]))
                l=i;
        }
        if(l==0)
            result[index++] = nums[k-1];
        else
            result[index++] = -1;
        System.out.println("l"+l);
        for(int i=k;i<nums.length;i++){
            if(nums[i-1]+1==nums[i]){
                System.out.println("i-l+1");
                System.out.println( (i-l+1));
                if((i-l+1)>=k){
                    System.out.println("*");
                    result[index++]=nums[i];
                }
            }
            else{
                l=i;
                result[index++]=-1;
            }
        }
        return result;
    }
}
