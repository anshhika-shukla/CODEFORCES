
import java.util.*;
public class codeforces65   //Problem 1807,B. Grab the Candies
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int e_Count=0;
            int o_Count=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2==0)
                {
                    e_Count+=arr[i];
                }
                else
                {
                    o_Count+=arr[i];
                }
            }
            if(e_Count>o_Count)
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
