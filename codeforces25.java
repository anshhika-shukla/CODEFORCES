import java.util.*;

public class codeforces25        //problem 492A,Vanya and Cubes
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int level = 0;
        int used = 0;

        while (true) 
        {
            level++;
            int need = level * (level + 1) / 2;

            if (used + need > n)
            {
                break;
            }

            used += need;
        }

        System.out.println(level - 1);
    }
}