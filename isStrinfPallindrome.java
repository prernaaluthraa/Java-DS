
public class solution {

public static boolean isStringPalindrome(String input) {
// Write your code here
        if(input.length()==0 || input.length()==1)
        {
            return true;
        }
        char firstch=input.charAt(0);
        char lastch=input.charAt(input.length()-1);
        String rest=input.substring(1,input.length()-1);
        Boolean ans=isStringPalindrome(rest);
        if(ans==true)
        {
            if(firstch==lastch)
            {
                return true;
               
            }
            else
            {
              return false;
            }
        }
          return false;
          }
          
