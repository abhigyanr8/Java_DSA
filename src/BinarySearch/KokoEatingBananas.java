package BinarySearch;

import java.util.Arrays;
import java.util.Collections;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int maxSpeed = Arrays.stream(piles).max().orElseThrow();
        int minSpeed = 1;
        int mid;
        Arrays.stream(piles).max();
        while(minSpeed <= maxSpeed){
            mid = minSpeed +(maxSpeed - minSpeed)/2 ;
            long h1 = calculateHforSpeed(piles , mid);
            if(h1 <= h) maxSpeed = mid-1;
            else minSpeed = mid+1;
        }
        return minSpeed;
    }
    public long calculateHforSpeed(int[] piles , int speed){
        long h=0;
        for(int i=0; i< piles.length; i++){
            h += (piles[i] + speed - 1) / speed;  // Efficient ceiling of pile/speed
        }
        return h;
    }
}
