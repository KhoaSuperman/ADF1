
public class Student
{
    private int id;
    private String name;
    private int age;
    
    public Student(int _id, String _name, int _age){
        this.id = _id;
        this.name = _name;
        this.age = _age;
    }
    
    //getter & setter
    public void setId(int _id){
        this.id = _id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setName(String _name){
        this.name = _name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int _vclHiep){
        this.age = _vclHiep;
    }
    
    
}
