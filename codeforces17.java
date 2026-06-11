import java.util.*;
public class codeforces17             //problem 2218,The 67th 6-7 Integer Problem
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int arr[]=new int[7];
            int m=Integer.MIN_VALUE;
            int sum=0;
            for(int i=0;i<7;i++) 
            {
                arr[i]=sc.nextInt();
                m=Math.max(m,arr[i]);
            }
            for(int i=0;i<7;i++) 
            {
                sum=sum+arr[i];
            }
            long st=-sum;
            st=st+2L*m;
            System.out.println(st);
        }
    }
}                  