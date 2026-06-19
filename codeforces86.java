import java.util.*;

public class codeforces86       //problem 233,A. Perfect Permutation
 {
    public static void main(String args[]) 
{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 != 0) 
{
            System.out.println(-1);
            return;
        }

        for (int i = 1; i <= n; i += 2) {
            System.out.print((i + 1) + " " + i);
            if (i + 1 < n) {
                System.out.print(" ");
            }
        }
    }
}