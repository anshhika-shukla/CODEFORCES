

import java.util.*;
public class codeforces66   //Problem 1360,B. Honest Coach
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
            {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int ans = (int) 1e9;
            for (int i = 1; i < n; i++) 
            {
                ans = Math.min(ans, a[i] - a[i - 1]);
            }
            System.out.println(ans);
        }
    }
}
