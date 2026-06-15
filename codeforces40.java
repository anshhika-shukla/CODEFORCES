import java.util.*;

public class codeforces40       //Problem 337,A. Puzzles
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] f = new int[m];

        for (int i = 0; i < m; i++) {
            f[i] = sc.nextInt();
        }

    
        Arrays.sort(f);

        int ans = Integer.MAX_VALUE;

    
             for (int i = 0; i + n - 1 < m; i++) {
            int B = f[i];
            int A = f[i + n - 1];
            ans = Math.min(ans, A - B);
        }

        System.out.println(ans);
    }
}
