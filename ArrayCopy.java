import java.util.Scanner;
public class ArrayCopy {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER ORDER OF MATRIX");
		int n = sc.nextInt();
		// array declaration
		int a[] = new int[n];
		int b[] = new int [n];
		for(int i = 0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			// copying elements in another array i.e; b
			b[i] = a[i];
		}
		System.out.println("FIRST ARRAY: ");
		for(int i = 0;i<a.length;i++)
		{
			System.out.printf(a[i]+" ");
			
		}	
		System.out.printf("\n");
		System.out.println("SECOND ARRAY: ");
		for(int i = 0;i<a.length;i++)
		{
			System.out.printf(b[i]+" ");
		}
		
		
	}

}
