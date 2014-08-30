
public class StudentManage
{   
    Student list[];
    int count = 0;
    
    public StudentManage(int numberOfStudent){
        list = new Student[numberOfStudent];
    }
    
    public void addStudent(Student s){
        list[count] = s;
        count++;
        System.out.println("Added new Student: "+s.getName());
    }
    
    public void displayStudents(){
        System.out.println("****List Students***");
        for(int i = 0; i < count; i++){
            Student s = list[i];
            
            System.out.println("ID: "+s.getId());
            System.out.println("Name: "+s.getName());
            System.out.println("Age: "+s.getAge());
            System.out.println("-----------------");
        }
    }

    public void searchStudentByName(String name){
        for(int i = 0; i < count; i++){
            Student s = list[i];
            if(s.getName().equals(name)){
                System.out.println("****Found student****");
                System.out.println("ID: "+s.getId());
                System.out.println("Name: "+s.getName());
                System.out.println("Age: "+s.getAge());
                System.out.println("-----------------");
            }
        }
    }
    
}
