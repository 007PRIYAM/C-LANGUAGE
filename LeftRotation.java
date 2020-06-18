import java.util.Scanner;
public class Solution {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(); // Number of Rotations
        int n = sc.nextInt(); // Order of Array
        int x[] =  new int[d];
        for(int i = 0 ; i < x.length ; i++)
        {
            x[i] = sc.nextInt();
        }
       
    // NOW DOING ROTATIONS
        for(int i = 0 ; i < n ; i++)
        {
            int j ;
            int first = x[0];
            for( j = 0 ; j < x.length - 1 ;j++)
            {
                x[j] = x[j+1];
            }
            x[j] = first;
        }
        for(int i = 0 ; i < x.length; i++)
        {
            System.out.print(x[i]+" ");
        }
    }  
    
    

}
