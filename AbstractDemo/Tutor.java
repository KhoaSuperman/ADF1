
public class Tutor extends Employee
{
    int batch;
    
    public Tutor(String _name, int _hour, int _batch ){
        super(_name, _hour);
        this.batch = _batch;
    }
    
    public double computeSalary(){
        return this.getHour() * 75000;
    }
    
}
