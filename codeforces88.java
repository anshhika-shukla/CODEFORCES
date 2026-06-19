import java.util.*;
public class codeforces88      //Problem 2234,B. Palindrome, Twelve and Two Terms
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0) 
        {
            long n=sc.nextLong();
            long ans;
            long a=n%12;
            if(a==10)
            {
                ans=22;
            }
            else
            {
                ans=a;
            }
            if(ans<=n)
            {
                System.out.println(ans+" " +(n - ans));
            }
            else
            {
                System.out.println(-1);
            }
        }
    }
}
