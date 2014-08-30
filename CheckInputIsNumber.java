
import java.util.Scanner;
import java.lang.Character;

public class CheckInputIsNumber
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        boolean isCharacter = true;
        int number = 0;
        while(isCharacter){/true
            try{
                System.out.println("enter number: ");
                String c = input.next();//b
                number = Integer.parseInt(c);
                isCharacter = false;//false
            }
            catch(Exception e){
                isCharacter = true;
            }
        }
        
        System.out.println("Number: "+number);
        */
       
       char c = '3';
       boolean isNumber = Character.isDigit(c);
       System.out.println(isNumber);
    }
}
