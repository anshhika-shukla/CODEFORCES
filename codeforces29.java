import java.util.*;

public class codeforces29   //problem 479, Expression
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maximum = Math.max(
                Math.max(
                        Math.max(a + b + c, a * b * c),
                        Math.max(a * (b + c), (a + b) * c)
                ),
                Math.max((a * b) + c, a + (b * c))
        );

        System.out.println(maximum);
    }
}