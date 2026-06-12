// Once I am done, I will be gone, You won't see me for a while.

import java.util.*;
public class codeforces27    //problem 450A,Jzzhu and Children
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int maxt=0;
        for(int i = 0; i < n; i++) 
        {
            if (a[i] % m == 0) 
            {
                a[i]--;
            }
            maxt = Math.max(maxt, a[i] / m);
        }
        int y = 0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] / m == maxt) 
            {
                y = i + 1; 
            }
        }

        System.out.println(y);

    }
}