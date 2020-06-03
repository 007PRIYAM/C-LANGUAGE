import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1 ; j <= n; j++)
            {
                if(j>=n+1-i)
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        staircase(n);
        //scanner.close();
    }
}
