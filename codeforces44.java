import java.util.*;

public class codeforces44         //Problem 12,A. Super Agent
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] v = new char[3][3];

        
        for (int i = 0; i < 3; i++) {
String s=sc.next();
            for (int j = 0; j < 3; j++) {
                v[i][j] = s.charAt(j);
            }
        }

        
        if ((v[0][0] == v[2][2]) &&
            (v[0][1] == v[2][1]) &&
            (v[0][2] == v[2][0]) &&
            (v[1][0] == v[1][2])) {

            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
