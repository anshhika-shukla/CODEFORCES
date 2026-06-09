import java.util.*;
public class codeforces1      //Problem 2204 , Passing the Ball
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int c=0;
            int n=sc.nextInt();
            String str=sc.next();
            for(int i=0;i<n;i++)
            {
                char ch=str.charAt(i);
                if(ch=='R')
                {
                    c++;
                }
                else
                {
                    break;
                }
            }
            System.out.println(c+1);
        }
    }
}
