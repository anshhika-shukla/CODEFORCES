

import java.util.*;
public class codeforces54       //problem 894,A. QAQ
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        long count=0,ans=0;
        String s=sc.next();
        int v[]=new int[s.length()];
        for(int i = 0; i < s.length(); i++) 
        {
            if(s.charAt(i)=='Q')
            {
                count++;
            }
            v[i]=(int)count;
        }
        for(int i=1;i<s.length()-1;i++) 
        {
            if(s.charAt(i)=='A') 
            {
                ans=ans+(long)v[i-1]*(v[s.length()-1]-v[i]);
            }
        }
        System.out.println(ans);
    }
}