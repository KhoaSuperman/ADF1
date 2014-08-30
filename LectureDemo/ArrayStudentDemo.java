
import java.util.Random;

public class ArrayStudentDemo
{
    public static void main(String[] args){
        Student list[] = new Student[4];
        
        Student s1 = new Student(1, "Mr.A");
        Student s2 = new Student(2, "Mr.B");
        Student s3 = new Student(3, "Mr.C");
        Student s4 = new Student(4, "Mr.D");
        
        //gán students vào mảng list
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        list[3] = s4;
        
        for(int i = 0; i < list.length; i++){
            Student s = list[i];
 
            System.out.println( "ID: "+s.getId() );
            System.out.println( "Name: "+s.getName() );
            System.out.println( "---------");
        }
        
        
        //
        
        System.out.println( "Reversed Array:" );
        for(int i = list.length -1 ; i >= 0; i--){
            Student s = list[i];
 
            System.out.println( "ID: "+s.getId() );
            System.out.println( "Name: "+s.getName() );
            System.out.println( "---------");
        }
        
        
        //print random index
        Random random = new Random();
        int randomIndex;
        for(int i = 0; i < list.length; i++){
            randomIndex = random.nextInt(4);
            Student s = list[randomIndex];
            
            System.out.println( "Student: "+randomIndex );
            System.out.println( "ID: "+s.getId() );
            System.out.println( "Name: "+s.getName() );
            System.out.println( "---------");
        }
        
    }
}
