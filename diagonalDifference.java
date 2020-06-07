import java.util.Scanner;
import java.math.*;
public class Diagonal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[][] = new int[n][n];
        for(int i = 0 ; i < n; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                x[i][j] = sc.nextInt();
            }
        }
        Diagonal d1 = new Diagonal();
        System.out.println(d1.diagonalDifference(x,n));
    }
    public int diagonalDifference(int ar[][],int n)
    { 
        int sum = 0;
        int sum1 = 0;
        for(int i = 0 ; i < n; i++)
        { 
            for(int j = 0 ; j < n ; j++)
            {
                if(i==j)
                {
                    sum += ar[i][j];
                }
                if(i == n-1-j && j == n-1-i)
                {
                    sum1 += ar[i][j];

                }
                
            }
        }
        int value = (sum - sum1);
        return Math.abs(value);
        
    }

}
