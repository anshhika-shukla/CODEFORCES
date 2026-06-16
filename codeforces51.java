import java.util.*;

public class codeforces51    //Problem 2140,A. Shift Sort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int c1 = 0;

            for (char c : s.toCharArray()) {
                if (c == '1') {
                    c1++;
                }
            }

            int z = 0;
            int o = n - c1;

            for (int i = o; i < n; i++) {
                if (s.charAt(i) == '0') {
                    z++;
                }
            }

            System.out.println(z);
        }


    }
}
