
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        int[] array = {2,6,4,7,5,9};
        int length = array.length;
        int[] clone = new int[length];
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.printf("Enter a:");
        int a = input.nextInt();
        System.out.printf("a: "+a);
        
        for(int i = 0 ; i < length ; i++){
            clone[length - i - 1] = array[i];
        }
        
        for(int i = 0 ; i < length ; i++){
            System.out.printf(clone[i]+"\n");
        }
    }
}
