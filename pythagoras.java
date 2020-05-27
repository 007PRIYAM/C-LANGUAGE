import java.util.Scanner;
public class Pytha {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int n = sc.nextInt();                                          // NUMBER OF TESTCASES
		int y[] = new int[n];                                         // ARRAY DECLARATION
		for(int i = 0 ; i < n; i++)
		{
			y[i] = sc.nextInt();                         // ARRAY INTIALISATION
		}
		for(int i = 0; i < n; i++)
		{
			for(int a= 0 ; a<=1000;a++)                  
			{
				for(int b = 0 ; b <= 1000; b++)
				{ 
					if(y[i] == b*b + a*a && a<=b)       // HERE SPECIFYING GIVEN CONDITION a<=b
					{
						System.out.printf("(%d,%d)",a,b);
					}
					
				}
				
			}
			System.out.println();
		
		}
	}
}
