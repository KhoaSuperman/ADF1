
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String[] args){
        MayTinh mt = new MayTinh();
        
        int number1 = 10;
        int number2 = 4;
        
        int result1 = mt.sum(number1, number2);
        System.out.println("Vietsub: tổng 2 số: "+result1);
        
        int result2 = mt.substract(number1, number2);
        System.out.println("Vietsub: Hiệu 2 số: "+result2);
        
        int result3 = mt.multiple(number1, number2);
        System.out.println("Vietsub: Tích: "+result3);
        
        float num1 = 10.0f;
        float num2 = 4.0f;
        float result4 = mt.divide(num1, num2);
        System.out.println("Vietsub: Thương 2 số: "+result4);
        
        
    }
}
