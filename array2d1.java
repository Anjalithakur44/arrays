import java.util.*;
import java.io.*;
public class array2d1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[20][20];
        int m,n,i,j,count_1=0,count_2=0,count_3=0,count_4=0,count_5=0;
        System.out.println("Enter the size of array=");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("Enter array elements");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        //logic for prinitng numbers:positive numbers,negative numbers,odd numbers,even numbers,number of zeros
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i][j]>0){
                 count_1 +=1;
                 if(a[i][j]%2!=0){
                  count_3 =count_3+1;}
                 else {
                  if(a[i][j]%2==0)
                  count_4 +=1;}
                }
                else if(a[i][j]<0)
                {
                    count_2 +=1;
                    if(a[i][j]%2!=0){
                     count_3 =count_3+1;}
                    else {
                     if(a[i][j]%2==0)
                     count_4 +=1;}
                }
                else
                {
                     count_5 +=1;
                     count_4 +=1;
                }
            }
        }
        System.out.println("The number of positive numbers="+count_1);
        System.out.println("The number of negative numbers="+count_2);
        System.out.println("The number of odd  numbers="+count_3);
        System.out.println("The number of even number="+count_4);
        System.out.println("The number of zeros="+count_5);
    }
}
