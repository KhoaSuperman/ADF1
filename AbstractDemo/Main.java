import java.util.*;

public class Main
{
    public static void main(String[] args){
        
        //java.util.Scanner input = new java.util.Scanner(System.in);
        
        
        Tutor t = new Tutor("Mr.A",3, 2014);
        double salary = t.computeSalary();
        t.common();
        System.out.printf("Tutor salary: "+salary);
        System.out.printf("Tutor batch: "+t.batch);
        
        Lecturer l = new Lecturer("Mr.V",3,"Director");
        double salary2 = l.computeSalary();
        l.common();
        System.out.printf("Lecturer salary: "+salary2);
        System.out.printf("Lecturer level: "+l.level);

        
    }
}
