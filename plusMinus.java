import java.util.Scanner;
public class plusMinus {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        for(int i = 0; i < n ; i++)
        {
            x[i] = sc.nextInt();
        }
        plusMinus P = new plusMinus();
        P.Solution(x,n);
        
    }
    public void Solution(int y[] ,int n)
    {
        float count1 = 0f;
        float count2 = 0f;
        float count3 = 0f;
        for(int i = 0 ; i < n ; i++)
        {
            if(y[i] < 0)
            {
                count2 += 1;
            }
            if(y[i] > 0)
            {
                count1 += 1;
            }
            if(y[i] == 0)
            {
                count3 += 1;
            }
        }
        
    
        System.out.printf("%.6f",count1/n);
        System.out.println();
        System.out.printf("%.6f",count2/n);
        System.out.println();
        System.out.printf("%.6f",count3/n);
        
    }

}
