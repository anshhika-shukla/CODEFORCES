import java.util.*;

public class codeforces28  //problem16A, Flag
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int v = -1;
        boolean ok = true;

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            int u = s.charAt(0);  

            for (int j = 0; j < m; j++) {
                if (s.charAt(j) != u) {
                    ok = false;
                }
            }

            if (v == u) {
                ok = false;
            }

            v = u;
        }

        if (ok) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}