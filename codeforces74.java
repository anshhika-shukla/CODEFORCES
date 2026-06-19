import java.util.*;

public class codeforces74   //problem 1850,B. Ten Words of Wisdom
 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int ans = 0;
            int mx = 0;

            for (int i = 1; i <= n; i++) {

                int a = sc.nextInt();
                int b = sc.nextInt();

                if (a <= 10 && b > mx) {
                    mx = b;
                    ans = i;
                }
            }

            System.out.println(ans);
        }

       
    }
}