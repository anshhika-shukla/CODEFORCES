import java.util.*;
public class codeforces7   //problem 61,. Ultra-Fast Mathematician
{
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
            String str1=sc.next();
            String str2=sc.next();
            int length=str1.length();
            for(int i=0;i<length;i++)
            {
                if(str1.charAt(i)==str2.charAt(i))
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
            }
        }
}