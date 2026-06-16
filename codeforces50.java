import java.util.*;

public class codeforces50          //problem 2193,C. Replace and Sum
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int q = sc.nextInt();

            long[] a = new long[n + 1];
            long[] b = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextLong();
            }

            for (int i = 1; i <= n; i++) {
                b[i] = sc.nextLong();
            }

            for (int i = 1; i <= n; i++) {
                long h = b[i];

                if (h > a[i]) {
                    a[i] = h;
                }
            }

            for (int i = n - 1; i >= 1; i--) {
                if (a[i] < a[i + 1]) {
                    a[i] = a[i + 1];
                }
            }

            long[] p = new long[n + 1];

            p[1] = a[1];

            for (int i = 2; i <= n; i++) {
                p[i] = p[i - 1] + a[i];
            }

            while (q-- > 0) {

                int l = sc.nextInt();
                int r = sc.nextInt();

                System.out.print((p[r] - p[l - 1]) + " ");
            }

            System.out.println();
        }

    }
}