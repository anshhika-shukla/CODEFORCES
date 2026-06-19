

import java.util.*;
public class codeforces97         //Problem 1742,B. Increasing
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            HashSet<Integer> s=new HashSet<>();
            for(int i=0;i<n;i++) 
            {
                int x=sc.nextInt();
                s.add(x);
            }
            if(s.size()==n) 
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
