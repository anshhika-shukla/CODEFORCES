import java.util.*;
public class codeforces94   //problem 2133,B. Villagers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            Long arr[]=new Long[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextLong();
            }
            Arrays.sort(arr,Collections.reverseOrder());
            long ans=0;
            for(int i=0;i<n;i+=2) 
            {
                ans=ans + arr[i];
            }
            System.out.println(ans);
        }
    }
}