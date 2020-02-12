
public class solution {

public static int countZerosRec(int input){
// Write your code here
        if(input == 0)
        {
            return 0;
        }
        int small=countZerosRec(input/10);
        if(input%10==0)
        {
            return 1+small;
        }
        return small;
   
}
}

