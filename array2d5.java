import java.util.*;
import java.io.*;
public class array2d5 {
    public static void odd_dimension_Matrix(int arr[][],int m,int n)
    {
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {  
               if(i==m/2|| j==n/2)
               System.out.print(arr[i][j]+" ");
               
            }
        }
        //System.out.println();
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[100][100];
        int m,n,i,j;
        System.out.println("No. of rows=");
        m=sc.nextInt();
        System.out.println("No. of columns=");
        n=sc.nextInt();
        System.out.println("Enter array elements=");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("print the array");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        odd_dimension_Matrix(arr,m,n);

    }
}
