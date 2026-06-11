import java.util.*;
public class codeforces20                 //Problem 1807, Plus or Minus
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a+b==c)
            {
                System.out.println("+");
            }
            else
            {
                 System.out.println("-");
            }
        }
    }
}
