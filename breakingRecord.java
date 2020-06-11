mport java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            x[i] = sc.nextInt();
        }
        Solution s1 = new Solution();
        s1.breakingRecords(x);       
    }
    public void  breakingRecords(int y[])
    {
        int count1 = 0;
        int count2 = 0;
        int Break = y[0];
        int Last  = y[0];
        for(int i = 0 ; i < y.length-1; i++)
        {
          
           if(y[i+1] > Break && y[i+1] != Break)
           { 
               Break = y[i+1];
               count1 += 1;
           }
           if(y[i+1] < Last && y[i+1] != Last)
           { 
               Last = y[i+1];
               count2 += 1;
           }
          
        }
         System.out.println(count1+" "+count2);
    }
}
   
