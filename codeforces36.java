import java.util.*;
public class codeforces36       //problem 2225, B. Alternating String
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();  
        while(t-->0)
        {
            String s=sc.next();  
            int c=0;
            for(int i=0;i<s.length()-1;i++) 
            {
                if(s.charAt(i) == s.charAt(i+1))
                {
                    c++;
                }
            }
            if(c<=2) 
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