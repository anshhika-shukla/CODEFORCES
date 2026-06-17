import java.util.*;
public class codeforces60    //problem 1996,A. Legs
{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int ans = (n + 3) / 4;

            System.out.println(ans);
        }
    }
}