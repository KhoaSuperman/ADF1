
public class Human implements Animal
{

    int height;
    
    public Human()
    {
        
    }
    
    public void eat(){
        height = 40;
        System.out.printf("Is eating" + this.height);
    }
}
