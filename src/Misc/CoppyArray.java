package Misc;

public class CoppyArray {
    public int countArrays(int[] original, int[][] bounds) {
        int minCount = Integer.MAX_VALUE;
        int u = bounds[0][1];
        int l = bounds[0][0];
        for(int i=1;i<bounds.length;i++){
            int dif = original[i]-original[i-1];
            u += dif;
            l += dif;
            if(u < bounds[i][0] || l > bounds[i][1])
                return 0;
            l = Math.max(bounds[i][0],l);
            u = Math.min(bounds[i][1],u);
            minCount = Math.min(minCount,(u-l+1));
        }
        return minCount;
    }
}
