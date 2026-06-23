import java.util.*;
public class codeforces104    //problem 2055,A. Two Frogs
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(Math.abs(a-b)%2!=1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}