package practice2;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Strings: ");
        String s1=sc.next();
        String s2=sc.next();
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int a=0;
        if(ch1.length==ch2.length)
        {
        for(int i=0;i<ch1.length;i++)
        {

                if(ch1[i]!=ch2[i])
                {
                   a=1;
                }


        }
        if(a==1)
        {
            System.out.println("Not Anagrams");
        }
        else
        {
            System.out.println("Anagrams");
        }
        }
        else
        {
            System.out.println("Not Anagrams");
        }
    }
}
