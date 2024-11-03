package BinarySearch;

import java.util.Arrays;

public class CapacityToShipPackagesWithinDDays {
    public int shipWithinDays(int[] weights, int days) {
        int r = Arrays.stream(weights).sum();
        int l = Arrays.stream(weights).max().orElseThrow();
        int d1,mid;
        if(days == 1)
            return r;
        while(l <= r){
            mid = l + (r - l)/2;
            d1 = calculateDaysForGivenCapacity(weights , mid);
            System.out.println("mid "+mid);
            System.out.println("d1 "+d1);
            if(d1 <= days){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
    public int calculateDaysForGivenCapacity(int[] weights, int capacity){
        int d1 =0 ;
        int sum =0;
        boolean flag = false;
        for(int weight : weights){
            flag = false;
            sum += weight;
            if(sum == capacity){
                flag = true;
                d1++;
                sum=0;
            }
            else if(sum > capacity){
                sum = weight;
                d1++;
            }
        }
        if(flag == false){
            d1++;
        }
        return d1;
    }
}
