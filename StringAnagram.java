import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your first string:");
	String s = input.next();
	System.out.println("Enter your second string:");
	String s1 = input.next();
	int flag=0;
	char char1[] = s.toCharArray();
	Arrays.sort(char1);
	// You can display the char1 array by uncommenting this thing...
// 	for(int i=0;i<char1.length;i++)
// 	{
// 	    System.out.print(char1[i]+" ");
// 	}
	char char2[] =  s1.toCharArray();
	System.out.println();
    Arrays.sort(char2);
    // You can display the char2 array by uncommenting this thing...
//     for(int i=0;i<char2.length;i++)
// 	{
// 	    System.out.print(char2[i]+" ");
// 	}
	if(s.length() == s1.length()){
	for(int i=0;i<s.length();i++)
	{
	    if(char1[i]==char2[i])
	    {
	        flag=1;
	    }
	    else 
	    {
	        flag=0;
	        break;
	    }
	}
	}
	else 
	{ 
	 System.out.println("Not Anagrams because length is not equal");  
	}
	if(flag==1 )
	{
	    System.out.println("Anagrams");
	}
	else if(flag==0 && s.length() == s1.length())
	{
	    System.out.println("Not Anagrams");
	}
	}
}
