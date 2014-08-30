

public class Knight
{
    String name;
    int health;
    int mana;
    int strength;
    int armor;
    String skill;
    
    //muốn khởi tạo 1 đối tượng trong game thì cần
    //hàm tạo - Constructor
    public Knight(String name, int _health, int _mana, int _strength, int _armor, String _skill){
        this.name = name;
        this.health = _health;
        this.mana = _mana;
        this.strength = _strength;
        this.armor = _armor;
        this.skill = _skill;
    }
    
    public void attack(){
        System.out.println(this.name + " is attacking ...");
    }
    
    public void attackGoal(String nameOfKnight){
        System.out.println(this.name + " attack "+nameOfKnight);
    }
    
    public void attackKnightObject(Knight k){
        System.out.println(this.name + " attack "+k.name);
        System.out.println("Info:");
        System.out.println("Health: "+k.health);
        System.out.println("Mana: "+k.mana);
        System.out.println("Strength: "+k.strength);
    }
    
    public void attackDamage(Knight k, int damage){
        System.out.println(this.name + "attack "+k.name);
        System.out.println("Damage: "+damage);
        
        k.health = k.health - damage;
        System.out.println("Health remaining: "+k.health);
    }
}
