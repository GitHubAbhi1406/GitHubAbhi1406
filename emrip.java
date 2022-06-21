package ArrayProblems;

import java.util.*;

public class emrip 
{
   public static boolean findReversePrime(int n)
   {
      int temp = n, rem = 0, rev = 0;
      while( temp != 0)
      {
         rem = temp % 10;
         rev = rev*10 + rem;
         temp = temp / 10;
      }
      boolean res = checkPrime(rev);
      return res;   
   }

   public static boolean checkPrime(int n)
   {
      if(n == 1 || n == 2 || n == 3 || n==5 || n == 7)
      {
         return false;
      }
      else
      {
        for(int i=2;i<n;i++)
        {
          if( n % i == 0)
          {
            return false;
          }
        }
      }
      return true;
   }
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the array size : ");
     int size = sc.nextInt();

     int a[] = new int[size];
     System.out.println("Enter the array elements : ");
     for(int i=0;i<size;i++)
     {
        a[i] = sc.nextInt();
     }
     
     for(int i=0;i<size;i++)
     {
       if(findReversePrime(a[i]) == true && checkPrime(a[i]) == true)
       {
         System.out.println("Emrip");
       }
       else
       {
         System.out.println("Not Emrip");
       }
     }

     sc.close();
   }   
}
