import java.util.Scanner;
public class Solution {
    // MAIN METHOD
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int n = sc.nextInt();
        int x[] = new int[n];
        for(int i = 0 ;i < x.length ; i++)
        {
            x[i] = sc.nextInt();
        }
        Solution s1 =  new Solution();
        System.out.println(s1.introTutorial(x,v));
        
    }
    public int introTutorial(int a[] , int u)
    {  
        int s = 0;
        
        for(int i = 0 ; i < a.length ; i++)
        {
            if( a[i] == u)
            {
                s = i;
            }
                
        }
        return s;
        
    }

}
