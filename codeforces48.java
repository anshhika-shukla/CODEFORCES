import java.util.*;

public class codeforces48    //Problem 2217,A. The Equalizer
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long sum = 0;
            long[] v = new long[(int)n];

            for (int i = 0; i < n; i++) {
                v[i] = sc.nextLong();
                sum += v[i];
            }

            if (sum % 2 != 0) {
                System.out.println("YES");
            } else {
                if ((n * k) % 2 == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }

        
    }
}
