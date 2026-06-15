import java.util.*;

public class codeforces39  // problem 318,B. Strings of Power
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        long count = 0;
        long ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i + 4 < s.length() && s.substring(i, i + 5).equals("heavy")) {
                count++;
            }
            if (i + 4 < s.length() && s.substring(i, i + 5).equals("metal")) {
                ans += count;
            }
        }

        System.out.println(ans);
        
    }
}