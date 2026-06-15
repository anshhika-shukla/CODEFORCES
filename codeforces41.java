import java.util.*;

public class codeforces41          //Problem 810,A. Straight «A»
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] v = new int[n];
        double s = 0;

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
            s += v[i];
        }

        double ans = s / n;
        ans = Math.round(ans);

        if (ans >= k) {
            System.out.println(0);
        } else {
            int c = 0;
            while ((double) s / n < k - 0.5) {
                s += k;
                n++;
                c++;
                ans = s / n;
            }
            System.out.println(c);
        }

    
    }
}
