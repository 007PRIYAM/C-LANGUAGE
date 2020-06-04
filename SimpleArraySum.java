import java.util.Scanner;
public class Solution1 {
    
    public static void main(String[] args)
    { 
         Scanner sc = new Scanner(System.in);  
         int x = sc.nextInt();
         int arr[] = new int[x];
         for(int i = 0;i < arr.length; i++)
         {
             arr[i] = sc.nextInt();
         }
         Solution1 s1 = new Solution1();
         System.out.println(s1.m1(arr));
         
    }
    public int m1(int y[])
    {
      int sum = 0;
      for(int i = 0;i < y.length; i++)
         {
            sum += y[i];
         }
     return sum ;
    }
}
