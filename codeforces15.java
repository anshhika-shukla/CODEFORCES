import java.util.*;
public class codeforces15                     //Problem 1487,Pythagorean Triples
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int l=(int)Math.sqrt((2*n)-1);
            System.out.println((l-1)/2);
        }
    }
}
