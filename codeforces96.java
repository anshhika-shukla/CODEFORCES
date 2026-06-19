import java.util.*;
public class codeforces96     //problem 1850,C. Word on the Paper
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            char a[][]=new char[8][8];
            for(int i=0;i<8;i++) 
            {
                String s=sc.next();
                for(int j=0;j<8;j++) 
                {
                    a[i][j]=s.charAt(j);
                }
            }
            StringBuilder ss=new StringBuilder();
            for(int i=0;i<8;i++) 
            {
                for(int j=0;j<8;j++) 
                {
                    if(a[i][j]!='.') 
                    {
                        ss.append(a[i][j]);
                    }
                }
            }
            System.out.println(ss);
        }
    }
}