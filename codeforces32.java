import java.util.*;

public class codeforces32   //Problem 2202, Parkour Design
    {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();

            if ((n + m) % 3 == 0) {
                if (m >= 0 && n >= (m * 2)) {
                    System.out.println("YES");
                } else if (m < 0 && n >= ((-1) * m * 4)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }

       
    }
}
