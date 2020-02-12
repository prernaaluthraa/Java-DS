public class Solution
{

public static int[] allIndexes(int input[], int x)
{

        int arr[]=new int[input.length];
        int l= allIndices(input,x,0,arr,0);
        int arr1[]=new int[l];
        for(int i=0;i<l;i++)
        {
            arr1[i]=arr[i];
        }
        return arr1;
}
   public static int allIndices(int input[],int x,int start,int arr[],int s) {
        if(start==input.length)
        {
            return s;
        }
        if(x==input[start])
        {
            arr[s]=start;
            s++;
        }
        return allIndices(input,x,start+1,arr,s);


}
