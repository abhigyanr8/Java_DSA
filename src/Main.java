import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{26,78,27,100,33,67,90,23,66,5,38,7,35,23,52,22,83,51,98,69,81,32,78,28,94,13,2,97,3,76,99,51,9,21,84,66,65,36,100,41};
        int[] rotatedArray = new int[]{4,5,6,7,8,1,2,3};
        int[] reverseSortedArray = new int[]{10,9,8,7,6,5,4,3,2,1};
        char[] charArray = new char[]{'a','b','c','d'};
        int[] piles = new int[]{332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184};
        List<Integer> result = new ArrayList<Integer>();
        //System.out.println(new BinarySearch().binarySearch(array,0,9,6));
        //System.out.println(new NoOfRotaions().noOfRotation(reverseSortedArray));
        //System.out.println(new CeilOfAnElement().ceilOfAnElement(array,));
        //System.out.println(new NextAlphabeticalElement().nextAlphabeticalElement(charArray,'d'));
        //System.out.println(new FirstOccurence().firstOccurence(array,7));
//        for(int i=0;i<array.length;i++)
//            System.out.print(array[i]+" ");
//        System.out.println("hello1");
//        result = new CountSmallerNumber().countSmaller(array);
//        System.out.println("hello");
//        for(int i=0;i<array.length;i++)
//            System.out.print(result.get(i)+" ");
        System.out.println(new KokoEatingBananas().minEatingSpeed(piles,823855818));
    }
}