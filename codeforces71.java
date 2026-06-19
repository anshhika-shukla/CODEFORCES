import java.util.*;
public class codeforces71   //problem 1791,B. Following Directions
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int x=0;
            int y=0;
            boolean ok=false;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='U')
                {
                    y++;
                }
                else if(s.charAt(i)=='D')
                {
                    y--;
                }
                else if(s.charAt(i)=='L')
                {
                    x--;
                }
                else
                {
                    x++;
                }
                if(x==1 && y==1)
                {
                    ok=true;
                    break;
                }
            }
            if(ok)
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