import java.util.*;

public class codeforces58       //Problem 2224,A. Zhily and Array Operating
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            for (int i = n - 2; i >= 0; i--) {

                if (a[i + 1] <= 0) {
                    continue;
                } else {
                    a[i] += a[i + 1];
                }
            }

            int c = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] > 0) {
                    c++;
                }
            }

           System.out.println(c);
        }

        
    }
}
