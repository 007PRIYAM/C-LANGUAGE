import java.util.Scanner;
public class Viral {
      public int viralAdvertising(int z)
      {
    	  int first = 5;
    	  int d = 0;
    	  int like ;
    	  for(int i = 1; i <= z ;i++)
    	  {
    		  like = first/2;
    		  d+=like;
    		  first = like*3;
    	  }
    	  return d;
      }
      // Main method
      public static void main(String[] args)
      {
    	  Scanner sc = new Scanner(System.in);
    	  int n = sc.nextInt();
    	  Viral v = new Viral();
    	  System.out.println(v.viralAdvertising(3));
      }
}
 
