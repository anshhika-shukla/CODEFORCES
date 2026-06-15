import java.util.*;
public class codeforces42         //Problem 2227,A. Koshary
{
    public static void main(String args[]) 
{
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a % 2 != 0 && b % 2 != 0)
             System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
