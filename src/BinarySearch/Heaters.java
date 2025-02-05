package BinarySearch;

public class Heaters {
    public int findRadius(int[] houses, int[] heaters) {
        int left = 0;
        int right = houses[houses.length-1] - houses[0];
        int mid = 0;
        int result=0;
        if(heaters[0] > houses[houses.length-1])
            return (heaters[0] - houses[0]);
        else if(houses[0] > heaters[heaters.length-1])
            return (houses[houses.length-1] - heaters[heaters.length-1]);
        while(left <= right){
            mid = (right + left)/2;
            boolean flag = true;
            int j = 0;
            for(int i=0; i<houses.length; i++){
                if(houses[i] < heaters[j]-mid || houses[i] > heaters[j]+mid){
                    if(heaters.length-1 > j)
                        j++;
                    if(houses[i] < heaters[j]-mid || houses[i] > heaters[j]+mid){
                        flag = false;
                    }
                }
            }
            if(flag == false)
                left = mid+1;
            else{
                System.out.println("right" +right);
                System.out.println("left" +left);
                System.out.println("j" + j);
                System.out.println("mid" + mid);
                result = mid;
                right = mid-1;
            }
        }
        return result;
    }
}
