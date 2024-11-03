package BinarySearch;

import java.util.Arrays;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int maxSpeed = piles[piles.length-1];
        int minSpeed = 1;
        int mid  ;
        while(minSpeed <= maxSpeed){
            mid = minSpeed +(maxSpeed - minSpeed)/2 ;
            long h1 = calculateHforSpeed(piles , mid);
            System.out.println("mid "+mid);
            System.out.println("h1 "+h1);
            if(h1 <= h) maxSpeed = mid-1;
            else minSpeed = mid+1;
        }
        return minSpeed;
    }
    public long calculateHforSpeed(int[] piles , int speed){
        long h=0;
        for(int i=0; i< piles.length; i++){
           if(piles[i] % speed == 0){
               h += piles[i] / speed ;
           }
           else {
               h += (piles[i] / speed) + 1;
           }
        }
        return h;
    }
}
