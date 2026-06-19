import java.util.*;
public class codeforces87      //problem 2234,A. Euclid, Sequence and Two Numbers
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            Long arr[]=new Long[n];
            for(int i=0;i<n;i++) 
            {
                arr[i]=sc.nextLong();
            }
            Arrays.sort(arr,Collections.reverseOrder());
            boolean ok=true;
            for(int i=0;i<n-2;i++) 
            {
                if(arr[i+2]!=(arr[i]%arr[i+1])) 
                {
                    ok=false;
                    break;
                }
            }
            if(n==2||ok) 
            {
                System.out.println(arr[0]+" "+arr[1]);
            } 
            else 
            {
                System.out.println("-1");
            }
        }
    }
}