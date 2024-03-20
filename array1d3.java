//second largest element in the array
import java.util.*;
import java.io.*;
public class array1d3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int i,j,n,temp;
        System.out.println("Size of array=");
        n=sc.nextInt();
        System.out.println("Enter array elements=");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        //sorting elements in ascending order
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("The second largest element in the array="+a[n-2]);
    }
}
