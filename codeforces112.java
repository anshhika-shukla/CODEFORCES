import java.util.*;
public class codeforces112  //problem 1872,D. Plus Minus Permutation
{

    public static long gcd(long a,long b) 
    {
        return b==0 ? Math.abs(a):gcd(b,a%b);
    }
    static long lcm(long a,long b) 
    {
        return(a/gcd(a,b))*b;
    }
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            long n=sc.nextLong();
            long x=sc.nextLong();
            long y=sc.nextLong();
            long l=lcm(x,y);
            long both=n/l;
            long a=(n/x)-both;
            long b=(n/y)-both;
            long pos=a*(2*n-a+1)/2;
            long neg=b*(b+1)/2;
            System.out.println(pos-neg);
         } 
    }
}