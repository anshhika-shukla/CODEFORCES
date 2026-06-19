import java.util.*;
public class codeforces78    //Problem 2232,C1. Seating Arrangement (Easy Version)
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int s=sc.nextInt();
            String u=sc.next();
            int d[]=new int[x+1];
            Arrays.fill(d,-1);
            d[0]=0; 
            for(int i=0;i<n;i++) 
            {
                char ch=u.charAt(i); 
                int p[]=Arrays.copyOf(d,x+1);
                if(ch=='I') 
                {
                    for (int j = 0; j < x; j++) 
                    {
                        if (d[j] != -1) 
                        {
                            p[j + 1] = Math.max(p[j + 1], d[j] + 1);
                        }
                    }
                } 
                else if (ch == 'E') 
                {
                    for (int j = 1; j <= x; j++) 
                    {
                        if (d[j] != -1 && d[j] < j * s) 
                        {
                            p[j] = Math.max(p[j], d[j] + 1);
                        }
                    }
                } 
                else if (ch == 'A') 
                {
                    for (int j = 0; j <= x; j++) 
                    {
                        if (d[j] != -1) 
                        {
                            if (j < x) 
                            {
                                p[j + 1] = Math.max(p[j + 1], d[j] + 1);
                            }
                           
                            if (j > 0 && d[j] < j * s) 
                            {
                                p[j] = Math.max(p[j], d[j] + 1);
                            }
                        }
                    }
                }
                d = p;
            }
            int mx = 0;
            for (int j = 0; j <= x; j++)
            {
                mx = Math.max(mx, d[j]);
            }
            System.out.println(mx);
        }
    }
}
