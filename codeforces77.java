import java.util.*;
public class codeforces77   //problem 2232,B. Cake Leveling
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);    
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            long a[]=new long[n];    
            for(int j=0;j<n;j++) 
            {
                a[j]=sc.nextLong();
            }
            long ps=0;
            long max=Long.MAX_VALUE;
            for(int i=0;i<n;i++) 
            {
                ps=ps+a[i];
                long c=ps/(i+1); 
                if(c<max) 
                {
                    max=c;
                }
                System.out.print(max+" ");
            }
            System.out.println();
        }
    }
}