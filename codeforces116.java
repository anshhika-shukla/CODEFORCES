import java.util.*;
public class codeforces116   //problem 2171,A. Shizuku Hoshikawa and Farm Legs
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t, j;
        t = sc.nextInt();

        for (j = 0; j < t; j++) {
            int n, a = 0;
            n = sc.nextInt();

            if (n % 2 != 0) {
                System.out.println("0");
            } else {
                a = (n / 4) + 1;
                System.out.println(a);
            }
        }
    }
}