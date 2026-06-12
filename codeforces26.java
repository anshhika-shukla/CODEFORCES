// Once I am done , I will be gone , You won't see me for a while

import java.util.*;
public class codeforces26      //problem2220, Blocked
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];

            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            
            Arrays.sort(a);

            int ans = 0;

        
            for (int i = 0; i < n - 1; i++) 
            {
                if (a[i + 1] - a[i] == 0) 
                {
                    ans++;
                }
            }

            if (ans > 0) 
            {
                System.out.println(-1);
            } 
            else 
            {
                for (int i = n - 1; i >= 0; i--)
                {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }
    }
}