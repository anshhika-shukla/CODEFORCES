
import java.util.*;
public class codeforces84     //Problem 1692,E. Binary Deque
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            int s=sc.nextInt();
            int a[]=new int[n];
            int total=0;
            for(int i=0;i<n;i++) 
            {
                a[i]=sc.nextInt();
                total=total+a[i];
            }
            if(total<s) 
            {
                System.out.println(-1);
                continue;
            }
            int l=0;
            int sum=0;
            int longest=-1;
            for(int r=0;r<n;r++) 
            {
                sum=sum+a[r];
                while(sum>s) 
                {
                    sum=sum-a[l++];
                }
                if(sum==s) 
                {
                    longest=Math.max(longest, r-l+1);
                }
            }
            System.out.println(n-longest);
        }
    }
}
