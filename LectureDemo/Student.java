
public class Student
{
    private int id;
    private String name;
    
    public Student(int _id, String _name){
        this.id = _id;
        this.name = _name;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(){
        this.name = name;
    }
    
    public void study(){
        System.out.println(this.name + " is studying ...");
    }
}
