import java.util.*;
import java.io.*;
public class array2d4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[100][100];
        int i,j,m,n,max=a[0][0];
        System.out.println("Size of array=");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("Enter array elements=");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        //logic for printing largest element in the array
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               if(a[i][j]>max)
               {
                max=a[i][j];
               }
            }
        }
        System.out.println("The largest element in the array="+max);
    }

}
