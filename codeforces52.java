

import java.util.*;
public class codeforces52      //Problem 2200,A. Eating Game
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++) 
            {
                a[i]=sc.nextInt();
            }
            int mx=a[0];
            for(int i=1;i<n;i++) 
            {
                if(a[i]>mx) 
                {
                    mx=a[i];
                }
            }
            int cnt=0;
            for(int i=0;i<n;i++) 
            {
                if(a[i]==mx) 
                {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
