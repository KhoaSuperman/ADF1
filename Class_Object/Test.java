
public class Test
{
    public static void main(String[] args){
        //khởi tạo 1 đối tượng Knight
        Knight k1 = new Knight("Arthur",600, 320, 10, 32, "chaos");
        Knight k2 = new Knight("Troll",300, 120, 20, 13, "warfare");
        
        //k1.attack();
        
        //k1.attackGoal("Leona");
        //k2.attackGoal("Leona");
        
        //k2.attackKnightObject(k1);
        
        k2.attackDamage(k1, 50);
    }
}
