import java.util.*;

public class codeforces115  //Problem 1927,A. Make it White
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int first = -1;
            int last = -1;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'B') {
                    if (first == -1) {
                        first = i;
                    }
                    last = i;
                }
            }

            System.out.println(last - first + 1);
        }

    }
}
