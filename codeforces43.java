

import java.util.*;
public class codeforces43             //Problem 2227,B. Party Monster
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int count=0;            
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='(')
                {
                    count++;
                }
            }
            if(count == n-count)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
