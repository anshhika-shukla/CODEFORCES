
import java.util.*;
public class codeforces5          //Problem 2204 ,Right Maximum
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0) 
        {
            long n=sc.nextLong();
            long arr[]=new long[(int)n];
            for(int i=0;i<n;i++) 
            {
                arr[i]=sc.nextLong();
            }
            long ans=0;
            long m=arr[0];
            for(int i=1;i<n;i++) 
            {
                m=Math.max(arr[i],m);
                if(arr[i]>=m) 
                {
                    ans++;
                }
            }
            System.out.println((ans+1));
        }
    }
}
