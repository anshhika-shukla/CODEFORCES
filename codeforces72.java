import java.util.*;
public class codeforces72   //Problem 1593,A. Elections
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
{
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long mv = Math.max(a, Math.max(b, c));
            long A, B, C;
            if (a == mv && a > b && a > c) {
                A = 0;
            } else {
                A = mv - a + 1;
            }
            if (b == mv && b > a && b > c) {
                B = 0;
            } else {
                B = mv - b + 1;
            }
            if (c == mv && c > a && c > b) {
                C = 0;
            } else {
                C = mv - c + 1;
            }
            System.out.println(A + " " + B + " " + C);
        }
    }
}
