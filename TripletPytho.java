package practice2;

import java.util.Arrays;
import java.util.Scanner;

public class PythagoreanTriplet
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();


        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
        int arr[]=new int[n];
        int flag=0;
            for(int a=0;i<n;i++)
        {
            arr[a]=sc.nextInt();
        }
        Arrays.sort(arr);
           for(int j=0;j<n;j++)
           {
               for(int k=j+1;k<n;k++)
               {
                   for(int l=k+1;l<n;l++)
                   {
                       if((arr[j]*arr[j])+(arr[k]*arr[k])==arr[l]*arr[l])
                       {
                           flag=1;
                       }
                   }
               }
           }

             if(flag==1)
        {
            System.out.println("Yes");
        }
        else if(flag==0)
        {
            System.out.println("No");
        }
        }

    }
}
