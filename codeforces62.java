import java.util.*;

public class codeforces62     //Problem 514,A. Chewbaсca and Number
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            int a = arr[i] - '0';
            int b = 9 - a;

            if (b < a) {

                if (i == 0 && b == 0) {
                    continue;
                } else {
                    arr[i] = (char) (b + '0');
                }
            }
        }

        System.out.print(new String(arr));
    }
}
