
import java.util.*;
public class codeforces69     //problem 1971,A. My First Sorting Problem
{
    public static void main(String args[]) 
    {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) 
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int mini = Math.min(x, y);
            int maxi = Math.max(x, y);
            System.out.println(mini + " " + maxi);
        }
    }
}