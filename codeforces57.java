import java.util.*;

public class codeforces57      //problem 1535,A. Fair Playoff
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int w1 = Math.max(a, b);
            int w2 = Math.max(c, d);

            int mx1 = Math.max(Math.max(a, b), Math.max(c, d));

            int[] arr = {a, b, c, d};
            Arrays.sort(arr);

            int mx2 = arr[2]; 

            if ((w1 == mx1 || w1 == mx2) &&
                (w2 == mx1 || w2 == mx2) &&
                w1 != w2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    
    }
}