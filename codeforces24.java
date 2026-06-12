import java.util.*;
public class codeforces24     //Problem 731A, Night at the Museum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char cur = 'a';
        int ans = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            int d = Math.abs(c - cur);
            ans = ans + Math.min(d, 26 - d);
            cur = c;
        }
        System.out.println(ans);
    }
}
