import java.util.*;
import java.io.*;
public class array1d2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int [10];
        int i,max=a[0];
        System.out.println("Size of array=");
        int n=sc.nextInt();
        System.out.println("Enter array elements=");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        //maximum elements
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        if(max!=a[0])
        {
            System.out.println("The maximum element in the array="+max);
        }

    }
}
