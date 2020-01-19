import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of testcases:");
		int testcase = input.nextInt();
	
	
		System.out.println("Enter the elements in the array:");
		int flag=0;
		for(int l=0;l<testcase;l++)
		{
		    
		int size = input.nextInt();
			int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
		    arr[i]=input.nextInt();
		}
		for(int i=0;i<size;i++)
		{
		    for(int j=i+1;j<size;j++)
		    {
		        for(int k=j+1;k<size;k++)
		        {
		            if((arr[i]*arr[i]) + (arr[j]*arr[j]) == (arr[k]*arr[k]))
		            {
		               flag=1;
		               break;
		            }
		            else 
		            {	
		                flag=0;
		            }
		            
		        }
		        if(flag==1)
		        {
		            break;
		        }
		    }
		    if(flag==1)
		    {
		        break;
		    }
		}
		if(flag==1)
		{
		System.out.println("Yes");
		}
		else 
		{
		    System.out.println("No");
		}
		
		}
	}
}
