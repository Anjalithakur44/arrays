import java.util.*;
import java.io.*;
public class array1d{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int a[]=new int[10];
       System.out.println("Size of array=");
       int n=sc.nextInt();
       int i,sum=0;
       System.out.println("Input the elements of array=");
       for(i=0;i<n;i++)
       {
        a[i]=sc.nextInt();
       }
       System.out.println("The inputted array:");
       for(i=0;i<n;i++)
       {
        System.out.print(a[i]+" ");
       }
       System.out.println();
       //calculating the sum of even indices elements
       for(i=0;i<n;i++)
       {
        if(i%2==0)
        {
            sum=sum+a[i];
        }
       } 
       System.out.println("The sum of elements on even indices="+sum);
    }
}