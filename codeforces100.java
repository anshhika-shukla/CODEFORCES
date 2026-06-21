import java.util.*;
public class codeforces100    //problem 486,A. Calculating Function
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long sum=0;
        if(n%2==0)
        {
            sum=n/2;
            System.out.println(sum);
        }
        else
        {
            sum=-(n+1)/2;
            System.out.println(sum);
        }
    }
}