import java.util.*;
public class codeforces76     //problem 2232,A. Convergence
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            long cc=0,ccc=0;
            long a[]=new long[n];
            for(int i=0;i<n;i++) 
            {
                a[i]=sc.nextLong();
            }
            Arrays.sort(a);
            for(int i=0;i<n/2;i++) 
            {
                if(a[i]!=a[n/2]) 
                {
                    cc++;
                }
            }
            for(int j=(n/2)+1;j<n;j++) 
            {
                if(a[j]!=a[n/2]) 
                {
                    ccc++;
                }
            }
            System.out.println(Math.max(cc, ccc));
        }
    }
}