import java.util.*;
public class codeforces55     //problem 935,A. Fafa and his Company
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int div = 0;
        for(long i = 1; i * i <= n; i++) 
        {
            if(n % i == 0) 
            {
                div++;
                if (i != n / i)
                {
                    div++;
                }
            }
        }
        System.out.println(div-1);
    }
}