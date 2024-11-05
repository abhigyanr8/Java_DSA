package Misc;

import java.util.*;

public class KClosetpointsToOrigin
{
    public int[][] kClosest(int[][] points, int k)
    {
        int[][] result = new int[points.length][2];
        Map<Integer,List<Integer>> hashMap = new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();

        for(int i=0;i<points.length;i++)
        {
            int dis = (points[i][0]*points[i][0]) + (points[i][1]*points[i][1]);
            ls.add(points[i][0]);
            ls.add(points[i][1]);
            hashMap.put(dis,ls);
            min_heap.add(dis);
            ls.clear();
        }
        int j=0;
        while(j<k)
        {
            System.out.println(min_heap.poll());
            ls=hashMap.get(min_heap.poll());
            int[] a = new int[2];
            a[0]=ls.get(0);
            a[1]=ls.get(1);
            result[j]=a;
        }
        return result;
    }
}
