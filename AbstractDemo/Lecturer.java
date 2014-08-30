
public class Lecturer extends Employee
{
    String level;
    
    public Lecturer(String _name, int _hour, String _level ){
        super(_name, _hour);
        this.level = _level;
    }
    
    @Override
    public void common(){
        System.out.println("Lecture");
    }
    
    public double computeSalary(){
        return this.getHour() * 125000;
    }
}
