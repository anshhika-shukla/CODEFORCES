import java.util.*;
public class codeforces79  //problem 2195,B. Heapify 1
{
    static boolean isPowerOfTwo(int x) 
    {
        return x>0 && (x&(x-1))==0;
    }
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            int a[]=new int[n+1];
            int pos[]=new int[n+1];
            for(int i=1;i<=n;i++) 
            {
                a[i]=sc.nextInt();
                pos[a[i]]=i;
            }
            boolean possible=true;
            for(int value=1;value<=n;value++) 
            {
                int currentPos=pos[value];
                if(currentPos==value)
                    continue;
                int small=Math.min(currentPos, value);
                int large=Math.max(currentPos, value);
                if (large % small != 0 || !isPowerOfTwo(large / small)) 
                {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}