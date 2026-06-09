import java.util.*;
public class codeforces4 {   //problem B 2209,Array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int[] v = new int[n];

            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt();
            }

            int shorte = 0;
            int longe = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (v[j] > v[i]) {
                        longe++;
                    } else if (v[j] < v[i]) {
                        shorte++;
                    }
                }
                System.out.print(Math.max(longe, shorte) + " ");
                longe = 0;
                shorte = 0;
            }
            System.out.println();
        }
    }
}