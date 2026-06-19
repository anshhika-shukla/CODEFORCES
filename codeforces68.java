

import java.util.*;
public class codeforces68     //problem 2044,C. Hard Problem
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int m=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int sum=0;
            int n=0;
            if(m>a) 
            {
                sum=sum+a;
                n=n+(m-a);
            } 
            else 
            {
                sum=sum+m;
            }
            if(m>b) 
            {
                sum=sum+b;
                n=n+(m-b);
            } 
            else 
            {
                sum=sum+m;
            }
            if(c<n) 
            {
                sum=sum+c;
            } 
            else 
            {
                sum=sum+n;
            }
            System.out.println(sum);
        }
    }
}