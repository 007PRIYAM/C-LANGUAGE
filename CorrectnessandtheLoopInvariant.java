import java.util.Scanner;
public class insertionSort {
    // MAIN METHOD
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int [n];
        for(int i = 0; i < x.length ; i++)
        {
            x[i] = sc.nextInt();        
        }
    insertionSort s = new insertionSort();
    s.insertionSort2(n,x);
    } 
    // ANOTHER METHOD
    public void insertionSort2(int n,int a[])
    {
        for(int i = 1; i < a.length; i++)
        {
            int temp = a[i];
            int j;
            for( j = i-1 ; j >= 0 && temp < a[j] ; j--)
            {
                a[j+1] = a[j];
                a[j] = temp;
            }
            
        }
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}
