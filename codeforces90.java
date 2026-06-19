import java.util.*;

public class codeforces90         //Problem 1514,B. AND 0, Sum Big
{
    static final long MOD = 1000000007L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long ans = 1;

            for (long i = 1; i <= k; i++) {
                ans = (ans * n) % MOD;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
