//peak element in the array
import java.util.*;
import java.io.*;
public class array1d4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int i,n,peak_ele=a[0],peak_index=0;
        System.out.println("size of array=");
        n=sc.nextInt();
        System.out.println("Input array elements=");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(peak_ele<a[i])
            {
                peak_ele=a[i];
                peak_index=i;
            }
        }
        System.out.println("The peak element is="+peak_ele+" at index position="+peak_index); 
    }
}
