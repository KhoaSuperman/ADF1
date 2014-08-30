

public class Test
{
    public static void main(String[] args){
        //khởi tạo hero1
        Hero hero1 = new Hero("Butcher",500, 120, 20, "Hook" );
        Hero hero2 = new Hero("Luna",300, 220, 10, "Nova" );
        
        //1. In ra thông tin hero - print hero's information
        System.out.println("Hero's name: "+hero1.name);
        System.out.println("Hero's health: "+hero1.health);
        System.out.println("Hero's mana: "+hero1.mana);
        System.out.println("Hero's strength: "+hero1.strength);
        System.out.println("Hero's skill: "+hero1.skill);
        
        //2. Call run action of hero - gọi hàm run của hero
        hero1.run();
        
        //3. Call attack of hero
        hero1.attack("Luna");
        
        //4. kill hero
        hero1.kill(hero2);
        
        //5. Attack with damage
        hero1.attackHero(hero2, 90);
    }
}
