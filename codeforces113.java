import java.util.*;
public class codeforces113  //Problem 2241,A. Divide and Conquer
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x%y==0) 
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
