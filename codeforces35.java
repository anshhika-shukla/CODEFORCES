import java.util.*;

public class codeforces35    //problem2225,A Number Between Two Others   
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();

            if (m / n == 2)
                System.out.println("NO");
            else
                System.out.println("YES");
        }

    }
}