
import java.util.Scanner;

public class MainStudent
{
    public static void main(String[] args){
        Student s1 = new Student(1 , "Mr.A");
        s1.study();
    }
    
    public static void printStudent(Student s){
        System.out.println( "ID: "+s.getId() );
        System.out.println( "Name: "+s.getName() );
        System.out.println( "---------");
    }
}
