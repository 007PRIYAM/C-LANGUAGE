import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public void compareTriplet(int a[],int b[])
    { 
        int Alice = 0;
        int Bob = 0;
        for(int i = 0; i < a.length ;i++)
        {
            if(a[i]>b[i])
            {
                Alice += 1 ;
            }
            if(a[i]==b[i])
            {
                continue;
            }
            if(a[i]<b[i])
            {
                Bob += 1;
            }
        }
        System.out.println(Alice+" "+Bob);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
      //  int x = sc.nextInt();
        int p[] = new int[3];
        int q[] = new int[3];
        for(int i = 0; i < p.length ; i++)
        {
            p[i] = sc.nextInt();
        }
          for(int i = 0; i < p.length ; i++)
        {
            q[i] = sc.nextInt();
        }
        Solution s1 = new Solution();
        s1.compareTriplet(p,q);
    }
}


  
