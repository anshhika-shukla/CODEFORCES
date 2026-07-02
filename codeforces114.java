import java.util.*;
public class codeforces114     //problem 2241,B. Good times Good times
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int c=0;
            int k=0;
            while(x!=0)
            {
                k=x%10;
                x=x/10;
                c++;
            }
            int b=(int)Math.pow(10,c);
            System.out.println(b+1);
        }
    }
}