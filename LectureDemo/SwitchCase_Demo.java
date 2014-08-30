
import java.util.Scanner;

public class SwitchCase_Demo
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        switch(number){
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            default:
                System.out.println("Không tìm số nào.");
                break;
        }
    }
}
