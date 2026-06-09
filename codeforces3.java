

import java.util.Scanner;
public class codeforces3    // problem A 58, Chat room 
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t="hello";
    int j=0;
   for (int i = 0; i < s.length() && j < t.length(); i++) 
   {
        if (s.charAt(i) == t.charAt(j)) 
        {
            j++;
        }
    }
      if (j == t.length()) 
    {
            System.out.println("YES");
    } else 
    {
            System.out.println("NO");
    }
    
}
}
