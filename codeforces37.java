import java.util.*;

public class codeforces37   //problem 214,A. System of Equations
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int cnt = 0;

        for (int a = 0; a <= 1000; a++) {
            int b = n - a * a;

            if (b < 0) continue;

            if (a + b * b == m) {
                cnt++;
            }
        }

        System.out.println(cnt);

        
    }
}