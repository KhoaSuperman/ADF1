
public class Hero
{
    
    //property
    String name;
    int health; //máu hero
    int mana; //năng lượng
    int strength;
    String skill;
    
    //constructor - hàm khởi tạo
    //hàm khởi tạo luôn luôn là public
    public Hero(String _name, int _health, int _mana, int _strength, String _skill){
        this.name = _name;
        this.health = _health;
        this.mana = _mana;
        this.strength = _strength;
        this.skill = _skill;
    }
    
    //viết hành động của đối tượng
    public void run(){
        System.out.println(this.name + " is running ...");
    }
    
    public void attack(String heroName){
        System.out.println(this.name + " attacks "+heroName);
    }
    
    public void attackHero(Hero h, int damage){
        h.health = h.health - damage;
        System.out.println(this.name + " attacks "+h.name);

        System.out.println("Health remaining: "+h.health);}
    
     
    public void kill(Hero h){
        System.out.println(this.name + " killed hero " + h.name);
        System.out.println("Hero's info");
        System.out.println("Health: "+h.health);
        System.out.println("Mana: "+h.mana);
        System.out.println("Strength: "+h.strength);
        System.out.println("Skill: "+h.skill);
    }
    
}
