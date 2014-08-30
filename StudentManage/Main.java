
public class Main
{
    public static void main(String[] args){
        StudentManage sm = new StudentManage(4);
        
        Student s1 = new Student(1, "Mr.A", 23);
        Student s2 = new Student(2, "Mr.B", 45);
        Student s3 = new Student(3, "Mr.C", 69);
        Student s4 = new Student(4, "Mr.D", 96);
        
        //add students
        sm.addStudent(s1);
        sm.addStudent(s2);
        sm.addStudent(s3);
        sm.addStudent(s4);
        
        //display
        sm.displayStudents();
        
        //
        String name = "Mr.C";
        sm.searchStudentByName(name);
    }
}
