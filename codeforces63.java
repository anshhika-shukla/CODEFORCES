import java.util.*;
public class codeforces63    //problem 1327,A. Sum of Odd Integers
{
    public static void main(String args[]) 
{
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();
            long k = sc.nextLong();

            if (n % 2 == 0) {

                if (k % 2 != 0) {
                    System.out.println("NO");
                } else {

                    long sum = (long) Math.sqrt(n);

                    if (k <= sum) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }

            } else {

                if (k % 2 == 0) {
                    System.out.println("NO");
                } else {

                    long sum = (long) Math.sqrt(n);

                    if (k <= sum) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}