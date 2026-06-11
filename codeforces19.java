import java.util.*;
public class codeforces19            //Problem 2121,Letter Home
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int[] x = new int[n];
            for (int i = 0; i < n; i++) 
            {
                x[i] = sc.nextInt();
            }
            int ans = Math.min(Math.abs(s - x[0]), Math.abs(s - x[n - 1])) 
                      + (x[n - 1] - x[0]);
            System.out.println(ans);
        }
    }
}
