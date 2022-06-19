package ArrayProblems;

import java.util.*;

public class arrayReverse
{
    public static void reverseArray(int a[], int n)
    {
        int[] rev_arr = new int[n];
        int j = n-1;

        for(int i=0;i<n;i++)
        {
                rev_arr[j] = a[i];
                j--;
        }

        System.out.println("Reversed Array : ");
        for(int x=0;x<n;x++)
        {
            System.out.print(rev_arr[x]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter the array elements : ");

        for(int i=0;i<size;i++)
        {
            a[i] = sc.nextInt();
        }

        reverseArray(a,size);

        System.out.println("Original Array : ");
        for(int x=0;x<size;x++)
        {
            System.out.print(a[x]+" ");
        }
        System.out.println();

        sc.close();
    }
}