import java.util.*;

public class codeforces38         //problem 2163,A. Souvlaki VS. Kalamaki
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int flag = 1;

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            for (int i = 0; i < n; i++) {
                if (i % 2 != 0 && i < n - 1) {
                    if (a[i] == a[i + 1]) {
                        flag = 1;
                    } else {
                        flag = 0;
                        break;
                    }
                }
            }

            if (flag == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    
    }
} 