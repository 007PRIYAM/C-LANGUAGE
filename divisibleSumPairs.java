import java.util.Scanner;
public class D {
	public int divisibleSumPairs(int x[],int n ,int k)
	{
		int sum = 0;
		for(int i = 0; i < x.length; i++)
		{
		     for(int j = i+1 ; j < x.length; j++)
		     {
		    	 if((x[i]+x[j]) % k == 0)
		    	 {
		    		 sum += 1;
		    	 }
		     }
		}
		return sum;
	}
	// Main method
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		D d1 = new D();
		System.out.println(d1.divisibleSumPairs(a, n, k));
	}

}
