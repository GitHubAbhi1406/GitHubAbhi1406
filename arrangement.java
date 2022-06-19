package ArrayProblems;

import java.util.*;
public class arrangement 
{
    public static void rearrangeArray(int a[],int n)
    {
        Arrays.sort(a);
        if( n % 2 == 0)
        {
        for(int j=n-1;j>n/2;j--)
        {
            if(a[j] > a[j-1])
            {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
        }
        }
        else if(n % 2 != 0)
        {
            for(int j=n-1;j>n/2+1;j--)
        {
            if(a[j] > a[j-1])
            {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
        }
        }
        System.out.println("Rearranged array is : ");
        for(int x=0;x<n;x++)
        {
            System.out.print(a[x]+" ");
        }
        System.out.println();
    }
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the array size : ");
     int n = sc.nextInt();

     int[] a = new int[n];
     System.out.println("Enter the array elements : ");
     for(int i=0;i<n;i++)
     {
        a[i] = sc.nextInt();
     }

     System.out.println("Original Array is : ");
     for(int j=0;j<n;j++)
     {
        System.out.print(a[j]+" ");
     }
     System.out.println();

     rearrangeArray(a,n);

     sc.close();
   }    
}
