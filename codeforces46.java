

import java.util.*;
public class codeforces46        //Problem 2091,C. Combination Lock
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            if (n%2==0) 
            {
                System.out.println("-1");
            } 
            else 
            {
                for(int i=2;i<=n;i=i+2) 
                {
                    System.out.print(i+" ");
                }
                for(int i=1;i<=n;i=i+2) 
                {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }
}
