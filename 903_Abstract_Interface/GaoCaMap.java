
public class GaoCaMap extends Gao implements IGaoCaMapSkill
{
    
    public GaoCaMap(int _health, int _mana, int _damage){
        this.health = _health;
        this.mana = _mana;
        this.name = "Gao Cá Mập";
        this.damage = _damage;
    }
    
    @Override
    public void gCaMap_Skill1(){
        System.out.println("Gao Cá Mâp sử dụng skill 1.");
    }
}
