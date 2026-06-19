import java.util.*;
public class codeforces73    //Problem 1676,B. Equal Candies
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            long a[] = new long[n];
            long mn = (long)1e18;
            long sum = 0;
            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextLong();
                mn = Math.min(mn, a[i]);
            }
            for(int i = 0; i < n; i++)
            {
                sum = sum + (a[i] - mn);
            }
            System.out.println(sum);
        }
    }
}
