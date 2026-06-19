import java.util.*;

public class codeforces82  //problem 1520,A. Do Not Be Distracted!
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            HashSet<Character> vis = new HashSet<>();
            boolean ok = true;

            vis.add(s.charAt(0));

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    if (vis.contains(s.charAt(i))) {
                        ok = false;
                        break;
                    }
                    vis.add(s.charAt(i));
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }

        sc.close();
    }
}