

import java.util.*;
public class codeforces34    //Problem 2211,C1. Equal Multisets (Easy Version)
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int v[]=new int[n];
            int u[]=new int[n];
            for(int i=0;i<n;i++) 
            {   
                v[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++) 
            {
                u[i]=sc.nextInt();
            }
            boolean leftokay=true;
            for(int i=0;i<n-k;i++) 
            {
                if(u[i]!=v[i] && u[i]!=-1) 
                {
                    leftokay=false;
                    break;
                }
            }
            boolean rightokay=true;
            for(int i=k;i<n;i++) 
            {
                if(u[i]!=v[i] && u[i]!=-1) {
                    rightokay=false;
                    break;
                }
            }
            int start=n-k;
            int end=k-1;
            int required=Math.max(0,end-start+1); 
            HashMap<Integer, Integer> freq=new HashMap<>();
            int wild=0;
            for(int i=start;i<=end;i++) 
            {
                if(u[i]==-1) 
                {
                    wild++;
                } 
                else 
                {
                    freq.put(u[i],freq.getOrDefault(u[i],0)+1);
                }
            }
            int match=wild;
            for(int i=start;i<=end;i++) 
            {
                if (freq.getOrDefault(v[i], 0)>0) 
                {
                    match++;
                }
            }
            boolean middleokay=(match>=required);
            if(leftokay && rightokay && middleokay) 
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
