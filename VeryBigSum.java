mport java.util.Scanner;
class Solution{
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        long x[] = new long[n];
        for(int i = 0 ; i < n ; i++)
        {
            x[i] = sc.nextLong();
        }
        Solution s1 = new Solution();
        System.out.println(s1.aVeryBigSum(x));
        
    }
    public long aVeryBigSum(long y[]) // method aVeryBigSum is used here
    {
        long sum = 0;
        for(int i = 0 ; i < y.length ;i++)
        {
            sum += y[i];
            
        }
        return sum;
    }
    
}
