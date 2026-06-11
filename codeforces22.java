import java.util.*;
public class codeforces22           //Problem 1873 , Good Kid
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) 
            {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            a[0]++;
            long product = 1;
            for (int i = 0; i < n; i++)
            {
                product =product * a[i];
            }
            System.out.println(product);
        }
    }
}
