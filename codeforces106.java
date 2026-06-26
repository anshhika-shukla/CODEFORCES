
import java.util.*;
public class codeforces106 
{
    public static void main(String args[])            //Problem 2056A. Shape Perimeter
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int x[]=new int[n];
            int y[]=new int[n];
            for(int i=0;i<n;i++) 
            {
                x[i]=sc.nextInt();
                y[i]=sc.nextInt();
            }
            long sum=0;
            for(int i=1;i<n;i++) 
            {
                x[i]=m-x[i];
                y[i]=m-y[i];
                sum=sum+2L*(x[i]+y[i]);
            }
            System.out.println((4L*m*n)-sum);
        }
    }
}
