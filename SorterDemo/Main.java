
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        int[] array = {5,3,7,8,2,1,10};
        int length = array.length;
        
        for(int i = 0; i < length; i++){
            for(int j = i + 1 ; j < length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        for(int i = 0; i < length ;i++){
            System.out.printf(array[i]+"\n");
        }
    }
    
}
