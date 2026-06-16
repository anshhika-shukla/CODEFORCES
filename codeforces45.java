

import java.util.*;
public class codeforces45            //Problem 1353,B. Two Arrays And Swaps
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++) 
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++) 
            {
                b[i]=sc.nextInt();
            }
            Arrays.sort(a);
            Integer[] bObj=new Integer[n];
            for(int i=0;i<n;i++) 
            {
                bObj[i]=b[i];
            }
            Arrays.sort(bObj,Collections.reverseOrder());
            for(int i=0;i<k;i++) 
            {
                if(bObj[i]>a[i]) 
                {
                    int temp=a[i];
                    a[i]=bObj[i];
                    bObj[i]=temp;
                } 
                else 
                {
                    break;
                }
            }
            int sum=0;
            for(int i=0;i<a.length;i++) 
            {
                sum=sum+a[i];
            }
            System.out.println(sum);
        }
    }
}
