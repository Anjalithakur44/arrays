import java.util.*;
import java.io.*;
public class array2d3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[100][100];
        int i,j,m,n;
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
        //logic for printing elements on primary and secondary diagonal for square matrix
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               if((i+j==n-1)||(i-j==0))
               {
                System.out.print(a[i][j]+" ");
               }
             
            }
        }
    }
}
