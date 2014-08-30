
public abstract class Employee
{
    protected String name;
    private int hour;
    
    public Employee(String _name, int _hour){
        this.name = _name;
        this.hour = _hour;
    }
    
    public abstract double computeSalary();
    
    public void common(){
        System.out.println("Employee");
    }
    
    public int getHour(){
        return hour;
    }
    
}
