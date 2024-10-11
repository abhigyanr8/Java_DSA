//https://leetcode.com/problems/minimum-window-substring/solutions/?envType=problem-list-v2&envId=sliding-window&difficulty=MEDIUM%2CHARD
package Hashing;
import java.util.Arrays;
public class minWindow
{
    public String minWindow(String s, String t) {
        int[] sCount = new int[58];
        int[] tCount = new int[58];
        for(int i=0;i<t.length();i++)
            tCount[t.charAt(i)-'A']++;
        int l=0;
        int minCount=Integer.MAX_VALUE;
        String result="";
        for(int i=0;i<s.length();i++){
            sCount[s.charAt(i)-'A']++;
            while(comapreFreq(sCount,tCount)){
                if(minCount>(i-l+1)) {
                    result = s.substring(l, i + 1);
                    minCount=(i-l+1);
                }
                sCount[s.charAt(l)-'A']--;
                l++;
            }
        }
        return result;
    }
    public boolean comapreFreq(int[] a,int[] b){
        for(int i=0;i<b.length;i++)
            if(a[i]<b[i])
                return false;
        return true;
    }
}
