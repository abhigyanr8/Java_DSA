package Misc;

public class LexicographicallySmall
{
    public String getSmallestString(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length()-1;i++)
        {
            int a = (int) sb.charAt(i);
            int b = (int) sb.charAt(i+1);

            if(a%2==0&&b%2==0)
            {
                if(b<a)
                {
                    char temp;
                    temp=sb.charAt(i);
                    sb.setCharAt(i,s.charAt(i+1));
                    sb.setCharAt(i+1,temp);
                    break;

                }
            }
            else if(a%2!=0&&b%2!=0)
            {
                if(b<a)
                {
                    char temp;
                    temp=sb.charAt(i);
                    sb.setCharAt(i,s.charAt(i+1));
                    sb.setCharAt(i+1,temp);
                    break;

                }
            }
        }
       return sb.toString();
    }
}
